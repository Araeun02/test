package com.test.java;

public class Ex9_11 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc"); //StringBuffer은 지정된 문자열을 변경가능
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2)); //sb와 sb2의 주소값을 비교
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		String s = sb.toString(); //StringBuffer의 내용을 String으로 변환
		String s2 = sb.toString(); //String s2 = new String(sb)
		
		System.out.println("s.equals(s2) ? " + s.equals(s2)); //sㅠ와 s2의 값을 비교
	}

}
