package com.test.java;

class Card99 {
	String kind;
	int number;
	
	Card99(){
		this("SPADE",1);
	}
	
	Card99(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}

public class Ex9_4 {
	public static void main(String [] args) {
		Card99 c1 = new Card99();
		Card99 c2 = new Card99();
		
		System.out.println(c1.toString());//같은 클래스에 대한 인스턴스 변수라도 주소값은 다르다.
		System.out.println(c2.toString());
	}
}