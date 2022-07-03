package com.test.java_Review;

class Pr4_7 {
	public static void main(String [] arg) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
			System.out.println(i + "," + str.charAt(i) + "," + sum); //아스키코드로 받는데 변환하는 방법 : ans(- '0') 으로 본래의 값을 찾음
		}
		
		System.out.println("sum=" + sum);
	}

}
