package com.test.java;

public class Ex8_1 {
	public static void main(String [] args) {
		System.out.println(1);
		try { //예외가 발생한다면 catch로 간다.
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) { // 예외가 발생하지 않았기에 catch는 생략
			System.out.println(4);
		}
		System.out.println(5);
	}

}
