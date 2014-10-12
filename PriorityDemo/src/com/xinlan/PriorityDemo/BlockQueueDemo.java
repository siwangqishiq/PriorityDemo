package com.xinlan.PriorityDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BlockQueueDemo {
	
	
	public static void main(String[] args) {
		final BlockingQueue queue = new ArrayBlockingQueue(3);//×èÈû¶ÓÁÐ
		BlockQueueDemo demo = new BlockQueueDemo();
		demo.doSome();
	}
	
	private void doSome(){
		Executor threadPool = Executors.newFixedThreadPool(2);
		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				 while(true)
				{
					System.out.println(Thread.currentThread().getName() +"run.....");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}//end while
			}
		});
		
		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				while(true)
				{
					System.out.println(Thread.currentThread().getName() +"run.....");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}//end while
			}
		});
	}
}// end class
