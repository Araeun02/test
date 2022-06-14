package com.test.java;

public class Ex4_12 {
	public static void main(String[] args) {
		int i=5;
		while(i--!=0) { // i--는 이번 문장이 아니라 다음문장부터 시행인데 왜 5부터 시작하지 않는가?
			System.out.println(i+" - I can do it.");
		}
	}

}
