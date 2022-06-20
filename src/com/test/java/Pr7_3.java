package com.test.java;

class Product10 { 
	int price;
	int bonusPoint;
	
	Product10(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Product10() {} //설마 생성자가 없어서?
}

class Tv10 extends Product10 {
	Tv10() {}
	@Override
	public String toString() {return "Tv";}
}

class Pr7_3 {
	public static void main(String[] args) {
		Tv10 t = new Tv10();
		System.out.println(t); // 오버라이딩 확인용
	}

}
