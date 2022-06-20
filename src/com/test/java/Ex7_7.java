package com.test.java;

public class Ex7_7 {
	public static void main(String [] args) {
		Car0 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe;
//		car.water(); 부모가 자식의 매서드를 가져올 순 없다. 하지만 public void water() { 형태처럼 만들어준다면 가능하다.
		fe2 = (FireEngine)car; //fe2 = car; 불가능 조상타입에서 자손 타입으로 가는건 생략 불가
		fe2.water();
	}
}

class Car0 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive,Brrr~");
	}
//	public void water() {
	}
	void stop() {
		System.out.println("stop!!!");
	}
	/*void water() {
	}*/
}

class FireEngine extends Car0 {
	void water() {
		System.out.println("water!!!");
	}
}
