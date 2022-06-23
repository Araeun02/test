package com.test.java;

class Pr8_4 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {//runtimeException, try와 catch가 없어도되는 애
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	public static void main(String [] args) {
		method(true);
		method(false);
	}
}
//method(true) 1, 예외발생으로 2는 스킵, 3 true랑 RuntimeException이랑 뭔상관? , 3이 떳다면 4는 스킵, 5는 무조건 출력,6도 메소드 안에 있기때문에 나와야하는거 아님? ㄴㄴ 예외가 발생하면 catch로 넘어가고 바로 끝나니까  return때문에 돌아가나?
//method(false) 1,2는 스킵,3??,4??, 5는 무조건 출력, 6도 출력