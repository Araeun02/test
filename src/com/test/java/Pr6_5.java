package com.test.java;

class PlayingCard {
	int kind; //인스턴스 변수
	int num; //인스턴스 변수
	
	static int width; //클래스(Static) 변수
	static int height; //클래스 변수
	
	PlayingCard(int k, int n){
		kind = k; //블럭 안에서만 적용되는 지역 변수
		num = n; //지역 변수
	}
	
	public static void main(String[] args) { //클래스 변수?
		PlayingCard card = new PlayingCard(1,1); // 인스턴스 변수
	}
}

