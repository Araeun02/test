package com.test.java;

class Pr9_1 {
	public static void main(String [] args) {
		SutdaCard0 c1 = new SutdaCard0(3, true);
		SutdaCard0 c2 = new SutdaCard0(3, true);
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c1.equals(c2):" + c1.equals(c2));
	}

}

class SutdaCard0 {
	int num;  //멤버변수
	boolean isKwang;
	
	SutdaCard0() {
		this(1,true);
	}
	
	SutdaCard0(int num, boolean isKwang){
		this.num = num; //매개변수
		this.isKwang = isKwang;
	}
	
	@Override
	public boolean equals(Object obj) {	
		if(obj instanceof SutdaCard0) {
			return num == num && isKwang == isKwang; //매개변수를 어떻게 부르지?
		} else {
			return false;
		}
		
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}	
}