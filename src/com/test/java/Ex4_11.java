package com.test.java;

public class Ex4_11 {
	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=2; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
