package com.test.java;
import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

class Ex12_1 {
	public static void main(String [] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p : list) // while(has.Next) 해도됨?
			System.out.println(p);//list에 있는 모든 내용용을 출력
	}
}
