package com.test.java_Review;

class Pr4_6 {
	public static void main(String [] args) {
		for(int x = 1; x <= 6; x++) {
			for(int y = 1; y <= 6; y++) {
				if((x+y) == 6)
					System.out.println(x + "," + y);
			}
		}
	}

}
