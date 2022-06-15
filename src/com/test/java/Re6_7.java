package com.test.java;

//class Data2 {int x;}

public class Re6_7 {
	public static void main(String [] args) {
		Data2 d = new Data2(); //Data2의 인스턴트 변수 d(주소)를 생성하라.
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		//change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void cange(Data2 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
