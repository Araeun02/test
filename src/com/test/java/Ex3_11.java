package com.test.java;

public class Ex3_11 {
	public static void main(String args[]) {
		double pi = 3.141592;
		double b = Math.round(pi * 1000) / 1000.0; // 왜 1000으로 나누는게 아니라 1000.0으로 나누는것? 소수점자리를 위해서?
		System.out.println(b);// shorp?
		
	}

}
