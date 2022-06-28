package com.test.java;
import java.util.*;

class Ex11_7 {
	public static void main(String [] args) {
		String [] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr); //대문자가 먼저 오고 소문자
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 X
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 역순 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
				Comparable c1 = (Comparable)o1;
				Comparable c2 = (Comparable)o2;
				return c1.compareTo(c2) * -1;
		}
		return -1;
	}
}
//프로그래머스 확인