package com.test.java;

public class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0) // 3으로 나누었을때 나머지가 0인것 즉 3의 배수
				continue;
			System.out.println(i);
		}
	}

}
