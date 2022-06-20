package com.test.java;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int  x = 0; x <cards.length; x++) {
			if(x>10) {
				x = (x % 10); // 나머지를 남기는 것
			} else if (x==1 || x==3 || x==8) {
				
			}
			
			cards[x] = SutdaCard;
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
	public static void main(String [] args) {
		SutdaDeck deck = new SutdaDeck();
		for(int i = 0; i < deck.cards.length; i++)
		System.out.println(deck.cards[i] + ",");
	}
	
}
