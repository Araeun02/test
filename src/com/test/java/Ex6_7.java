package com.test.java;

class Data2 {int x;}

public class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2(); //Data2의 인스턴트 변수 d(주소)를 생성, d = 참조변수
		d.x = 10; //Data2 d의 주소에 있는 x에 10의 값을 넣음 
		System.out.println("main() : x = " + d.x); //Data2 d에 있는 x의 값 
		change(d); //change를 호출해서 명령을 시행, 
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x); //Data2 d의 x의 주소인 1000을 출력
	}
	//참조형(내가 직접 만듬) 매개변수인 d <> 기본형(int, long 등등) 매개 변수
	static void change(Data2 d) { //참조 변수 d는 참조 변수라서 따로 값을 가지지 않기에 참조 변수 d의 주소를 가져옴
		d.x = 1000; //d.x는 Data2 d의 x값이 저장된 주소에 1000을 넣은것
		System.out.println("change() : x = " + d.x);
	}

}
