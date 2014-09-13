package com.xinlan.PriorityDemo;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityTest {
	public static void main(String args[])
	{
		PriorityQueue<Type> heap = new PriorityQueue<Type>(1,idComparator);
		
//		PriorityQueue<Type> heap = new PriorityQueue<Type>();
		
		heap.offer(Type.RUSH);
		heap.offer(Type.RUSH);
		heap.offer(Type.NORMAL);
		heap.offer(Type.GROUP);
		heap.offer(Type.RUSH);
		heap.offer(Type.BIGSALE);
		heap.offer(Type.BIGSALE);
		
		while(!heap.isEmpty())
		{
			System.out.println(heap.poll());
		}//end while
	}
	
	public static Comparator<Type> idComparator = new Comparator<Type>()
			{

				@Override
				public int compare(Type o1, Type o2) {
					return o1.getPriority()>o2.getPriority()?-1:1;
				}
		
			};
}//end class
