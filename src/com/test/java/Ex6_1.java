package com.test.java;

public class Ex6_1 {
	public static void main(String [] args) {
		Tv t;            //Tv를 위한 변수 t
		t = new Tv();    //TV자리를 만듬 = TV인스턴스를 생성
		t.channel = 7;   // Tv인스턴스의 멤버변수인 channel의 값을 7로 한다
		t.channelDown(); //Tv인스턴스의 매서드(기능) channelDown()을 부른다
		System.out.println("현재 채널은 "+t.channel+"입니다.");
	}

}

class Tv {          //Tv의 속성
	String color;   // 색 // 참조형(color)이므로 기본값 null
	boolean power;  // 전원(true = on,false = off // boolean(power)이므로 기본값 false
	int channel;    // Tv인스턴스의 멤버변수 channel,color,power //기본형 channel(int)이므로 기본값 0
	
	void power() {power = !power;} // on or off
	void channelUp() { ++channel;} // 채널을 높이는 매서드
	void channelDown() {--channel;} // 채널을 낮추는 매서드
}
//인스턴스(color,power,channel)은 참조 변수를 통해서만 다룰수 있다.
//참조 변수의 타입은 인스턴스의 타입과 일치해야한다.(?)이게 무슨말?
//t.channel의 형태가 참조변수의 타입을 인스턴스의 타입과 일치한것?