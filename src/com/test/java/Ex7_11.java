package com.test.java;

public class Ex7_11 {
	public static void main(String [] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2{ // class는 extend(확장하다)로 상속, interface는 implements(구현하다)로 상속
	public void method1() { 
		System.out.println("method1() in Child3");
	}
}

class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}

interface MyInterface {
	default void method1() { //디폴트 매서드 <=> void method1(); 추상매서드
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}
//인터페이스는 다중상속이 가능, 클래스는 불가능 interface는 class처럼 모든 클래스의 공통조상이 없다