package com.test.java;

public class C99 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %-5d", i, j, j*i);
			}
			System.out.println();
		}
	}

}
