package com.test.java;

public class Ex9_11 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("ab ==ab2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		String s = sb.toString(); //StringBuffer의 내용을 String으로 변환
		String s2 = sb.toString(); //String s2 = new String(sb)
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}

}
