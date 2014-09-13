package com.xinlan.PriorityDemo;

import java.util.PriorityQueue;

public class Demo2 {
	public static void main(String[] agrs) {
		PriorityQueue<Type> heap = new PriorityQueue<Type>();
		
		
		heap.offer(Type.BIGSALE);
		heap.offer(Type.BIGSALE);
		heap.offer(Type.NORMAL);
		heap.offer(Type.RUSH);
		heap.offer(Type.GROUP);
		
		System.out.println("start");
		while(!heap.isEmpty())
		{
			System.out.println(heap.poll());
		}//end while
	}// end main
}// end class
