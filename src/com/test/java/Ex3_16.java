package com.test.java;

public class Ex3_16 {
	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch<'a' ll ch >'z'=%b%n",ch < 'a' || ch > 'z');
		System.out.printf("!('a'<= && ch<='z')=%b%n", !('a'<= ch && ch<='z'));
		System.out.printf(" 'a'<=ch && ch <=ch 'z'=%b%n", 'a'<=ch && ch<= 'z');
		
	}//main의 끝

}
