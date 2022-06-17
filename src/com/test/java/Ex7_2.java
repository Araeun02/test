package com.test.java;

public class Ex7_2 {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
	}

}

class Parent { int x = 10; /* super.x */} //super.x는 x과 구별하기 위해

class Child extends Parent {
	int x = 20; //this.x, x의 값을 덮어씀(오버라이딩)
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x = " + this.x); // class Parent의 x
		System.out.println("super.x = " + super.x); // class Child의 x
	}
}