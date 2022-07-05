package com.test.java;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

class Pr14_1 {
	public static void main(String [] args) {
//	(a, b) -> a > b ? a : b
//	(name, i) -> System.out.println(name + "=" + i)
//	x -> x * x
//	() -> (int)(Math.random() * 6
//	(int[] arr) -> {sum += for(int i : arr)} //이게 맞나?
// int[]::new
		BiFunction<Integer, Integer, Integer> f = (a, b) -> a>b ? a:b;
		IntBinaryOperator f2 = (int a, int b) -> a>b ? a:b;
		
	}
}
