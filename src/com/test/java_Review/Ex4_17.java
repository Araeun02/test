package com.test.java_Review;

class Ex4_17 {
	public static void main(String [] args) {
		for(int i = 0; i <= 100; i++) {
			if(i%3==0)//3의 배수
				continue; //위의 조건이 만족되고 continue가 있으면 생략하여 다음으로 넘어감
			System.out.println(i);
		}
	}
}
