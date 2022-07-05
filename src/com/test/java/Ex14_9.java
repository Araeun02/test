package com.test.java;
import java.util.*;
import java.util.stream.*;

class Ex14_9 {
	public static void main(String [] args) {
		String[] strArr = {
			"Inheritance", "java", "Lanbda", "stream", "OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);// 조건이 불일치하면 참
		Optional<String> sWord = Stream.of(strArr)
			.filter(s -> s.charAt(0) == 's').findFirst();//findFirst? 처음으로 찾은걸 가져와라? 여러개일수도 있으니까?
		
		System.out.println("noEmptyStr=" + noEmptyStr);
		System.out.println("sWord=" + sWord.get());
		
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);// ??
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0,  (a,b) -> a + 1);
		int sum = intStream2.reduce(0, (a,b) -> a+b);
		
		OptionalInt max = intStream3.reduce(Integer::max); //reduce?	(a,b) -> Integer.max(a,b)
		OptionalInt min = intStream4.reduce(Integer::min);	//			(a,b) -> Integer.min(a,b)
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
		System.out.println("max=" + max.getAsInt());
		System.out.println("min=" + min.getAsInt());
		
	}

}
