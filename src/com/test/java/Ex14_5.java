package com.test.java;
import java.util.*;
import java.util.stream.*;

class Ex14_5 {
	public static void main(String [] args) {
		Stream<Student05> studentStream = Stream.of(
				new Student05("이자바", 3, 300),
				new Student05("김자바", 1, 200),
				new Student05("안자바", 2, 100),
				new Student05("박자바", 2, 150),
				new Student05("소자바", 1, 200),
				new Student05("나자바", 3, 290),
				new Student05("김자바", 3, 180)
			);
		
		studentStream.sorted(Comparator.comparing(Student05::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
	}

}

class Student05 implements Comparable<Student05> {
	String name;
	int ban;
	int totalScore;
	Student05(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
	String getName() {return name;}
	int getBan() {return ban;}
	int getTotalScore() {return totalScore;}
	
	public int compareTo(Student05 s) {
		return s.totalScore - this.totalScore; //보통은 this - s로 오름차순을 쓰지면 여기에선 반대로 s - this를 적용하여 내림차순을 했다
	}
}