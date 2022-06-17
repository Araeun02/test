package com.test.java;

class Tv0{
	boolean power;
	int channel;
	
	void power() {power = !power;} //power on, off
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class SmartTv extends Tv0{ //Tv(부모), smartTv(자식) 형태는 class 자식 extends 부모
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

class Ex7_1 {
	public static void main(String [] args) { //오류 
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello,world");
		stv.caption = true;
		stv.displayCaption("Hello,world");
	}
}
	
	
//상속 ,포함관계

