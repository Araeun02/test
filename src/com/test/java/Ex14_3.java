package com.test.java;
import java.util.function.*;

class Ex14_3 {
	public static void main(String [] args) {
		Predicate<Integer> p = i -> i < 100; //Predicate 매개변수 하나 받고 반환 타입은 boolean
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 ==0; // 2의 배수
		Predicate<Integer> notP = p.negate(); //negate? 반대 p.negate = i >= 100
		
		Predicate<Integer> all = notP.and(q.or(r));  //notP를 만족하고 q또는 r을 만족한다. and(&&) or(||)
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2); //굳이 result를 쓸 필요가 있나?
//		System.out.println(p2.test(str2));
		System.out.println(result);
	}

}
