package com.xinlan.PriorityDemo;

import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(4);
		queue.add(2);

		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + ",");
		}// end while

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(6);
		pq.offer(-3);
		pq.offer(9);
		pq.offer(0);
		System.out.println(pq);
		for (int i = 0; i < 4; ++i) {
			System.out.println(pq.poll());
		}

	}

}// end class
