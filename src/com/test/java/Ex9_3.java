package com.test.java;

public class Ex9_3 {
	public static void main(String [] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()); //String클래스는 문자열이 같으면 동일한 HashCode를 반환하도록 되어 있다.
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1)); //주소값으로 HashCode를 생성하므로 다름
		System.out.println(System.identityHashCode(str2));
	}

}
