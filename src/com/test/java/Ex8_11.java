package com.test.java;

public class Ex8_11 {
	public static void main(String [] args) {
		try {
			startInstall(); // 설치시작
			copyFiles(); //파일복사
		} catch(SpaceException e) { //원래 spaceException이라는 Exception이 있나?
			System.out.println("에러 메세지 :" + e.getMessage()); //getMessage가 어디서 나온거? 밑에 없음
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch(MemoryException me) {
			System.out.println("에러메시지:" + me.getMessage()); //Exception에 getMessage가 있나봄
			me.printStackTrace();
			System.gc(); //gc?
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles(); // 임시파일 삭제
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) //용량부족
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory()) //메모리부족?이게 무슨뜻? 램이 부족하다는건가?
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {
		return true;
	}
	
	static boolean enoughMemory() {
		return false;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}