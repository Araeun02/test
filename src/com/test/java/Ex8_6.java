package com.test.java;

public class Ex8_6 {
	public static void main(String [] args) {
		try {
			Exception e = new Exception("고의로 발생시킴"); //Exception e = new Exception(); 기본적인 형태, e는 변수
			throw e; // throw가 트리거, 예외를 발생시킴
		
		} catch (Exception e) {
			System.out.println("에러 메세지 :" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}

}
