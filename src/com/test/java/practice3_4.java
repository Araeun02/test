package com.test.java;

public class practice3_4 {
	public static void main(String[] args) {
		int numofApples = 110;
		int sizeofBucket = 10;
		int numofBucket = (numofApples / sizeofBucket) + (numofApples % sizeofBucket > 0 ? 1 : 0);
		
		//System.out.println("필요한 바구니의 수 :"+numofBucket);
		System.out.printf("%d", numofBucket);
	}

}
