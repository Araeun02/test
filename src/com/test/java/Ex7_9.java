package com.test.java;

class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Product2() {} //생성자
}

class Tv2 extends Product2 {
	Tv2() {super(100);} //조상클래스의 생성자인 Product2(int price)를 호출
	@Override //오버라이딩시에는 표시
	public String toString() {return "Tv";}
}

class Computer2 extends Product2 {
	Computer2(){super(200);}
	@Override
	public String toString() {return "Computer";}
}

class Audio2 extends Product2 {
	Audio2(){super(50);}
	@Override
	public String toString() {return "Audio";}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i =0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			System.out.println(cart[i].price);
			sum += cart[i].price;
			itemList += cart[i] + ",";
			//itemList += (i==0)?"" + cart[i] : "," + cart[i];
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Ex7_9 {
	public static void main(String [] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}

}
