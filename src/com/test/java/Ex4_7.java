package com.test.java;

public class Ex4_7 {
	public static void main(String arg[]) {
		int num = 0;
		
		for (int i = 1; i <= 5; i++) {
			num = (int)(Math.random()*6)+1;
			System.out.println(i +": " + num);
		}
	}

}
