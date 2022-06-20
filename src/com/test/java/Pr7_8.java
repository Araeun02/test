package com.test.java;

class Outer9 {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer9.this.value);
		}
	}
}

public class Pr7_8 {
	public static void main(String [] args) {
		Outer9 outer = new Outer9();
		Outer9.Inner inner = outer.new Inner();
		inner.method1();
	}

}
// 30,20,10