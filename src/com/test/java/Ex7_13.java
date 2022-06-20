package com.test.java;

public class Ex7_13 {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner(); // 인스턴스멤버 간에는 서로 접근 가능
	static StaticInner cv = new StaticInner(); //static멤버 간에는 서로 접근 가능
	static void staticMethod() {
		StaticInner obj2 = new StaticInner();
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instaceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner Iv = new LocalInner();
	}
}
