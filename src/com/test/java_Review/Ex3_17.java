package com.test.java_Review;

public class Ex3_17 {
	public static void main(String [] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x>= 0 ? x : -x; // x가 0이상이면 그대로 x, 아니라면 -x를 absX에 저장하라
		absY = y>= 0 ? y : -y;
		absZ = z>= 0 ? z : -z;
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}

}
