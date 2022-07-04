package com.test.java_Review;

class Pr5_5 {
	public static void main(String [] args) {
		int [] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] ball3 = new int[3];
		
		for(int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length); //0 ~ 8 사이의 랜덤한 수
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
			ball3[0] = ballArr[0];
			ball3[1] = ballArr[1];
			ball3[2] = ballArr[2];
		
		for(int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}

}
