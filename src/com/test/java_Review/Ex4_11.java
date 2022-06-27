package com.test.java_Review;

public class Ex4_11 {
	public static void main(String [] args) {
		for(int i = 1; i<=5;i++) {
			for(int j =1; j<=i; j++) {//i가 j보다 커지기 전까지 루프 i가 1이면 1번, i가 2면 2번
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
