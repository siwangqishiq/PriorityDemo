package com.xinlan.PriorityDemo;

public class EnumTest {
	public static void main(String[] agrs) {
		WeekDay day = WeekDay.SUN;
		
		System.out.println(day.name());
		
		System.out.println(day.ordinal());
		
		System.out.println(WeekDay.valueOf("SAT"));
		
		System.out.println(WeekDay.values().length);
		
		
		WeekDay d = WeekDay.FRI;
		d.getValue();
	}
	
	/**
	 * Ã¶¾Ù
	 * @author panyi
	 *
	 */
	public enum WeekDay implements Compaer{
		SUN,MON,TUE,WED,TUS,FRI,SAT;
		int value;
		private WeekDay() {
		}
		private WeekDay(int day){
			this.value = day;
		}
		
		public int getValue()
		{
			return value;
		}
		@Override
		public void test() {
			
		}
	}//end enum
	
	interface Compaer{
		void test();
	}
}//end 
