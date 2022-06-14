package com.test.java;

public class Ex2_8 {
	public static void main(String arg[]) {
		int x = 10,y = 5,z = 15;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		int tmp = x;
		x=y;
		y=tmp;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}

}
