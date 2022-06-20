package com.test.java;

class Outer {
	class Inner {
		int iv = 100;
	}
}

public class Pr7_6 {
	public static void main(String [] args) {
		Outer ou = new Outer();
		Outer.Inner lv = ou.new Inner();
		System.out.println(lv.iv);
	}

}
