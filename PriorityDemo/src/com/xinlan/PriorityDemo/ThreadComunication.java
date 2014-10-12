package com.xinlan.PriorityDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadComunication {
	public static void main(String[] args) {
		ThreadComunication demo = new ThreadComunication();
		demo.demo();
	}
	
	private void demo(){
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		final ThreadComPro pro = new ThreadComPro();
		
		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				pro.mainThread();
			}
		});//mainThread run....
		
		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				pro.subThread();
			}
		});//subThread run
	}
}// end class
