package com.test.java;

public class PrRe6_18 {
	public static boolean isNumber(String str) {//매서드명 isNumber, 반환타입 boolean, 매개변수 String str
		for(int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x);
			if(!(x>='0' && x<='9')) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}
