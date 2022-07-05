package com.test.java;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pr14_5 {
	public static void main(String [] args) {
		String [] strArr = {"aaa", "bb", "c", "dddd"};
		
		Stream.of(strArr);
		
		IntStream intStream = Stream.of(strArr).mapToInt(String::length);
		
		OptionalInt max = intStream.reduce(Integer::max);
		
		System.out.println(max.getAsInt());
	}

}

