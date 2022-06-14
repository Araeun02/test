package com.test.java;

public class Pr4_6 {
	public static void main(String[]args) {
		int sum = 0;

		for(int x = 1; x<=6; x++) {
			for(int y =1; y<=6; y++) {
				if(x+y == 6) {
					System.out.printf("%d"+"%d",x,y);
					System.out.println();
				}
			}
			
		}
	}

	

}