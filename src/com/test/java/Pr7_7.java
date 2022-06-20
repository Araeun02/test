package com.test.java;

class Outer1 {
	static class Inner {
		int iv = 200; //static이 필요 한거 아닌가? 아래 처럼 static int iv = 200;
		static int lv = 200;
	}
}

public class Pr7_7 {
	public static void main(String [] args) {
		System.out.println(Outer1.Inner.iv); //static이라서 항상 열려있기에 따로 열어줄 필요 없이
		System.out.println(Outer1.Inner.lv);
	}
}
