package com.test.java;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int  x = 0; x <cards.length; x++) {
			if(x>11) {
				x = (x*10)/10;
			}
			System.out.println(cards[x]);
			
			cards[x] = //x를 어디담아야되냐?
		}
		
		
		
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Pr7_1 {
	public static void  main(String [] args) {
		SutdaDeck deck = new SutdaDeck();
		for(int i = 0; i < deck.cards.length; i++)
		System.out.println(deck.cards[i] + ",");
	}
	
}
