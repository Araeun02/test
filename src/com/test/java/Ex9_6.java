package com.test.java;

class Ex9_6 {
	public static void main(String [] args) {
		String str1 = String.valueOf("abc");
		String str2 = "abc";
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2 ? " + (str1 == str2)); //비교연산자(==)으로비교 했다면 다
		System.out.println("str1.equals(str2) ? " + str1.equals(str2)); //equals는 내용비교
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println("String str3 = new String(\"abc\";");
		System.out.println("String str4 = new String(\"abc\";");
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4)); 
	}
	
}
