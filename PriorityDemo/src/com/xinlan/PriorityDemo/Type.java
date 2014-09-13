package com.xinlan.PriorityDemo;

public enum Type {
	NORMAL(2),
	RUSH(3),
	GROUP(4),
	BIGSALE(10);
	
	private int priotity;
	
	private Type(int priority)
	{
		this.priotity = priority;
	}
	
	public int getPriority()
	{
		return this.priotity;
	}
	
	
}//end enum
