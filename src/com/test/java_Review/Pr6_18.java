package com.test.java_Review;

class Pr6_18 {
	public static void main(String [] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
	}


	static boolean isNumber(String str) {
		for(int x = 0; x < str.length(); x++) {
			char y = str.charAt(x);
			if(!(y >= '0' && y <= '9')) {
				return false;
			}
		}
		return true;
	}
}