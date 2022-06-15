package com.test.java;

public class Re6_6 {
	public static void main(String[] args) {
		Data d = new Data(); // Data의 인스턴트 변수(d {주소})를 만듬, d = 참조변수
		d.x = 10; //d.x Data d의 주소에 있는 x에 10이라는 값을 넣음
		System.out.println("main() : x = " + d.x); //Data d의 x값을 출력
		
		change(d.x); //change = call stack 호출 스택 즉 change를 호출해서 명령을 시행하라
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); // 그래서 d.x는 1000이 아니라 10이다.
	}
	
	static void change(int x) { //x = 기본형(int) 매개변수
		x = 1000; //Data d의 주소에 있는 x의 값을 1000으로 변경
		System.out.println("change() : x + " + x);
	} // 블럭이 꺼지면서 x의 값도 사라짐

}
//Re6_7과 비교하면서 이해할것