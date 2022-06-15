package com.test.java;

//class Data3 {int x;}

public class Re6_8 {
	public static void main(String[] args) {
		Data3 d = new Data3(); //Data의 인스턴트 변수 or 참조 변수인 (d)를 생성
		d.x = 10;
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		
		return tmp;
	}
	

}
