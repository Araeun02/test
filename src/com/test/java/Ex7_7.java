package com.test.java;

public class Ex7_7 {
	public static void main(String [] args) {
		Car0 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe;
		//car.water();
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
