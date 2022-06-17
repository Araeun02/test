package com.test.java;

public class Pr6_21 {
	public static int abs(int value) {
		
		//return value < 0 ? -value : value;
		
		if (value < 0) 
			value = -value;
		
		/*if(value>=0) {
			//value; //value;이 안되는 이유
			value = value * 1;
		} else if(value<0) {
			value = value * -1;
		}*/
		
		return value;
			
	}
	
	
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}

}
