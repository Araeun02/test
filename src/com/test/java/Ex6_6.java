package com.test.java;
class Data {int x;}

public class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10; //d.x가 왜 갑자기 튀어나옴? d.x의 뜻
		
		Data d2 = new Data();
		d2.x = 15;
		
		int a = 10;
		int b = a;
		a = 20;
		
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
