package com.test.java;

public class Ex8_9 {
	public static void main(String [] args) throws Exception {
		method1(); //main이 method1호출
	}
	
	static void method1() throws Exception {
		method2(); //method1이 method2를 호출
	}
	
	static void method2() throws Exception {
		throw new Exception(); //= Exception e = new Exception(), throw e와 같음 즉 예외를 만들고 즉시 발생
	}
}
