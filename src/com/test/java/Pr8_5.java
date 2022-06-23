package com.test.java;

class Pr8_5 {
	public static void main(String [] args) {
		try {
			method1(); //method1 호출
		} catch (Exception e) {
			System.out.println(5);
		}
	}
	
	static void method1() {
		try {
			method2(); //method2 호출
			System.out.println(1);
		} catch (ArithmeticException e) { //NullPointerException이 ArithmeticException을 발생시키나? 맞다면 2가 적히고 아니면 1
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		
		System.out.println(4);
	}
	
	static void method2() {
		throw new NullPointerException(); //오류발생
	} //왜 경고?

}
//Null...이 오류가 맞다면 2,3,4,5
//Null...이 오류가 아니라면  1,3,4,5
//1 3 5 1 2 5 6
