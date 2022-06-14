package com.test.java;

public class Pr4_7 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i<str.length(); i++) { //str.length string str의 숫자 자릿수
			char s = str.charAt(i); //charAt(a) a에 해당하는 자리 수를 추출함
			System.out.println(s);
			sum += s - '0' ;
		}
		System.out.println("sum="+sum);
	}

}
//왜 255가 나오는지 이해가 안감 1+2+3+4+5