package com.test.java;

public class Ex8_2 {
	public static void main(String [] args) {
		System.out.println(1);
		try {
			System.out.println(0/0); //0/0을 하며 ArithmeticException을 고의로 발생시킴
			System.out.println(2); // 위에서 예외상황이 발생하면 생략되고 바로 catch로 넘어간다.
		} catch (ArithmeticException ae) {
			System.out.println(3);
		}
		System.out.println(4);
	}

}
