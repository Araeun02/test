package com.test.java;

public class Ex7_12 {
	class InstanceInner {
		int iv = 100;
//		static int cv = 100;//static 변수를 선언할 수 없다. 이유는 static 클래스만이 static멤버를 변경할 수 있기때문
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int in = 200;
		static int cv = 200; //static 클래스만이 static 멤버를 정의할 수 있다.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;
			final static int CONST = 300; //final static 상수(pi 3.14..) final은 한번 저장하고 변경불가
		}
	}
	
	public static void main(String args[]) {
//		System.out.println(InstanceInner.iv);
//		System.out.println(InstanceInner.cv);
		System.out.println(InstanceInner.CONST);
//		System.out.println(StaticInner.iv);
		System.out.println(StaticInner.cv);
//		System.out.println(StaticInner.CONST);
	}

}
