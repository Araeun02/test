package com.test.java;
import java.io.*;
import java.util.stream.*;

class Ex14_6 {
	public static void main(String [] args) {
		File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};
		
		Stream<File> fileStream = Stream.of(fileArr); //Stream.of?
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println);
		
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName)
			.filter(s -> s.indexOf('.')!= -1) // indexOf? -1?
//			.peek(s -> System.out.printf("filename=%s%n", s)) // 확장자가 없는 것은 제외
			.map(s -> s.substring(s.indexOf('.') + 1)) // substring?
//			.peek(s-> System.out.printf("extension=%s%n", s)) //확장자 출력
			.map(String::toUpperCase) // 문자로 변환
			.distinct() //중복제거
			.forEach(System.out::print);
		
		System.out.println();
	}

}
