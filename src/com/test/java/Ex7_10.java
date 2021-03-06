package com.test.java;

public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = {new Marine0(), new Tank(), new Dropship()};
		
		for(int i = 0; i < group.length; i++)
			group[i].move(100,200);
	}
}

abstract class Unit{ //공통조상 Unit
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}
class Marine0 extends Unit{ //추상 클래스
	void move(int x, int y) { //추상 매서드
		System.out.println("Marine[x=" + x + ", y=" + y + "]"); //추상 매서드
	}
	void stimpack() {}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y +"]");
	}
	void changeMode() {}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load() {}
	void unload() {}
}
//