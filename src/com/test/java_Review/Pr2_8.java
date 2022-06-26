package com.test.java_Review;

public class Pr2_8 {
	public static void main(String [] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = 0;
		tmp = x; //tmp에 x값을 저장 tmp = x = 1
		x = y; // x에 y값(2)을 넣음
		y = z; // y에 z값(3)을 넣음
		z = tmp; 
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}
