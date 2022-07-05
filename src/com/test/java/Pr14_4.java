package com.test.java;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Pr14_4 {
	public static void main(String [] args) {
		Stream<Integer> dice = IntStream.rangeClosed(1, 6).boxed();
		
		dice.flatMap(i -> IntStream.rangeClosed(1, 6).boxed().map(i2 -> new int[] {i, i2}))
			.filter(arr -> arr[0] + arr[1] == 6)
			.forEach(arr -> System.out.println(Arrays.toString(arr)));
		
	}

}
