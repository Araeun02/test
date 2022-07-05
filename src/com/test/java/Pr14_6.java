package com.test.java;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Pr14_6 {
	public static void main(String [] args) {
		String [] strArr = {"aaa", "bb", "c", "dddd"};
		
		Stream.of(strArr);
		
		IntStream intStream = Stream.of(strArr).mapToInt(String::length);
		
		int sum = intStream.reduce(0, (a,b) -> a +b);
		
		System.out.println(sum);
	}

}
