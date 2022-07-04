package com.test.java_Review;

class Ex6_1 {
	public static void main(String [] args) {
		Tv06 t;
		t = new Tv06();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}
}

class Tv06 {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
