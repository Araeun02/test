package com.test.java;

public class Ex6_3 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width); //width나 height처럼 클래스 변수(공통 변수)는 모든 값을 공유하므로 객체생성(clss Card)와 관계없이 사용 가능
		System.out.println("Card.width = " + Card.height); // class Card와 상관 없이 Card.width와 Card.height로 직접 사용 가능
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind+ ","+c1.number+"이며, 크기는 ("+ c1.width + ","+ c1.height+")");
		System.out.println("c2은 " + c2.kind+ ","+c2.number+"이며, 크기는 ("+ c2.width + ","+ c2.height+")");
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
		c1.width = 50; //class 변수의 값을 재지정 그렇다면 static int width나 height의 값 자체가 바뀐것? 아니면 해당 구문?에만 적용 된것?
		c1.height = 80;
		System.out.println("c1은 "+ c1.kind+","+c1.number+"이며,크기는 ("+ c1.width+","+c1.height+")");
		System.out.println("c2는 "+ c2.kind+","+c2.number+"이며,크기는 ("+ c2.width+","+c2.height+")");

	}


}

class Card {
	String kind; //인스턴스변수(개별변수) : 모든 카드가 각각의 값을 가짐
	int number;  //인스턴스변수(개별변수)
	static int width = 100; //클래스 변수(공통변수) : 모든 카드가 공통의 값을 가짐
	static int height = 250;//클래스 변수(공통변수)
}