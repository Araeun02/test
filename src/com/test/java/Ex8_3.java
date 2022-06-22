package com.test.java;

public class Ex8_3 {
	public static void main(String [] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException 발생
			System.out.println(4); //당연하게도 생략됨
		} catch(Exception e) {  // ArithmeticException은 Exception의 자식 클래스
			System.out.println(5);
		}
		System.out.println(6);
	}

}
