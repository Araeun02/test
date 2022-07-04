package com.test.java_Review;

class Ex6_3 {
	public static void main(String [] args) {
		System.out.println("Card06.width = " + Card06.width);
		System.out.println("Car06.height = " + Card06.height);
		
		Card06 c1 = new Card06();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card06 c2 = new Card06();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c2.width + "," + c1.height + ")");
		System.out.println("c2은" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c1.height + ")");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c2.width + "," + c1.height + ")");
		System.out.println("c2은" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c1.height + ")");
	}
}

class Card06 {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}