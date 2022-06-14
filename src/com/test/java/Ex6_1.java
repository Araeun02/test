package com.test.java;

public class Ex6_1 {
	public static void main(String [] args) {
		Tv t; //Tv를 위한 변수 t
		t = new Tv(); //TV자리를 만듬
		t.channel = 7; // Tv인스턴스의 멤버변수인 channel의 값을 7로 한다
		t.channelDown(); //Tv인스턴스의 매서드 channelDown()을 부른다
		System.out.println("현재 채널은 "+t.channel+"입니다.");
	}

}

class Tv { //Tv의 속성
	String color; //색
	boolean power; // 전원(true = on,false = off)
	int channel; // Tv인스턴스의 멤버변수 channel
	
	void power() {power = !power;} // on or off
	void channelUp() { ++channel;} // 채널을 높이는 매서드
	void channelDown() {--channel;} // 채널을 낮추는 매서드
}
