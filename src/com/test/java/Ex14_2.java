package com.test.java;
import java.util.function.*;
import java.util.*;

class Ex14_2 {
	public static void main(String [] args) { // 함수쓸때 i를 쓰는 이유, 아무변수나 상관없나?
		Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1; // s는 1에서 100까지 중 랜덤
		Consumer<Integer> c = i -> System.out.print(i+",");// c = i,
		Predicate<Integer> p = i -> i%2==0; 
		Function<Integer, Integer> f = i -> i/10*10; // 1의 자리 버림
		
		List<Integer> list = new ArrayList<>(); //list라는 배열을 만들고
		makeRandomList(s, list); //list에 s를 넣고
		System.out.println(list); 
		printEvenNum(p, c, list);
		List<Integer> newList = doSomthing(f, list);
		System.out.println(newList);
		
	}
	
	static<T> List<T> doSomthing(Function<T, T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size()); //list.size? = list.length?
		
		for(T i : list) {
			newList.add(f.apply(i));//apply?
		}
		
		return newList;
		
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) // test?
				c.accept(i); // accept?
		}
		
		System.out.println("]");
	}
	
	static<T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i < 10; i++) {
			list.add(s.get());// s.get? list에 s로 가져온 10개의 숫자를 넣음
		}
	}

}
