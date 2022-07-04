package com.test.java;
import java.util.*;

class Ex14_8 {
	public static void main(String [] args) {
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length); //
		System.out.println("optStr=" + optStr.get());
		System.out.println("optInt=" + optInt.get());
		
		int result1 = Optional.of("123")
			.filter(x->x.length() > 0)
			.map(Integer::parseInt).get();//숫자로 변환해서 저장
		
		int result2 = Optional.of("")
				.filter(x->x.length() > 0)
				.map(Integer::parseInt).orElse(-1); //아니라면 -1로 출력
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		Optional.of("456").map(Integer::parseInt)
			.ifPresent(x -> System.out.printf("result3 =%d%n",x)); //ifPresent?
		
		OptionalInt optInt1 = OptionalInt.of(0);
		OptionalInt optInt2 = OptionalInt.empty();
		
		System.out.println(optInt1.isPresent()); //isPresent?
		System.out.println(optInt2.isPresent());
		
		System.out.println(optInt1.getAsInt()); //int로 가져와라?
		System.out.println("optInt1=" + optInt1);
		System.out.println("optInt2=" + optInt2);
		System.out.println("optInt1.equals(optInt2)?" + optInt1.equals(optInt2)); // 값이 같은가? 0 = empty?
			
			
	}

}
