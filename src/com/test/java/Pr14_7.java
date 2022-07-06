package com.test.java;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pr14_7 {
	public static void main(String [] args) {
		//Stream<Integer> Lotto = IntStream.rangeClosed(1, 45).boxed();
		IntStream lotto = new Random().ints(1, 46);
		
		lotto
			.distinct()
			.limit(6)
			.sorted()
			.forEach(System.out::println);
		
	}
}
