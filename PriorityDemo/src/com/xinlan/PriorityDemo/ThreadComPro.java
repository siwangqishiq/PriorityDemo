package com.xinlan.PriorityDemo;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadComPro {
	private int subRunTimes = 1;
	private int mainRunTimes = 1;
	private Random random = new Random();
	private ReentrantLock mLock =new ReentrantLock();
	private Condition condition = mLock.newCondition();
	private int runThread=1;

	public void mainThread() {
		while (true) {
			mLock.lock();
			while(runThread!=1){
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//end while
			
			sleep();
			System.out.println("主线程运行.......(运行次数" + mainRunTimes + ")");
			mainRunTimes++;
			runThread = 2;
			condition.signal();
			
			mLock.unlock();
			sleep();
		}// end while
	}

	public void subThread() {
		while (true) {
			mLock.lock();
			while(runThread!=2){
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//end while
			sleep();
			System.out.println("孩子线程运行.......(运行次数" + subRunTimes + ")");
			subRunTimes++;
			runThread=1;
			condition.signal();
			mLock.unlock();
			sleep();
		}// end while
	}
	
	private void sleep(){
		try {
			Thread.sleep(1000 + random.nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}// end class
