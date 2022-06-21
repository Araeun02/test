package com.test.java;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int x=0; x < CARD_NUM; x++) {
			int num = x % 10 + 1;
			boolean isKwang = false;
			if( x==0 || x==2 || x==7)
				isKwang = true;
			SutdaCard card = new SutdaCard(num, isKwang);
			cards[x] = card;
		}
	}
	
	void shuffle() {
		int j = 0;
		SutdaCard tmp;
		for(int y = 0; y < cards.length; y++) {
			j = (int)(Math.random() * 10 +1);
			tmp = cards[y];
			cards[y] = cards[j];
			cards[j] = tmp;	
		}
	}
	
	void pick(int index) {
		if(index < 0 || index >= CARD_NUM)
		return SutdaCard; //반환라는게 retrun?
	}
	
	pick() {
		int z = (int)(Math.random() % + 1);
		return 
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Pr7_1 {
	public static void main(String [] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}

}
