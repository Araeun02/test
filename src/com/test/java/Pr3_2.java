package com.test.java;

public class Pr3_2 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자 코드는 65
		
		System.out.println(1+x<<33); // ==와 <=는 비교 연산자 그럼 <<도 비교 연사자이고 <는 뭐가 다른가? // 왜 6?
		System.out.println(y>=5||x<0 && x>2); // 5>=5 true
		System.out.println(y += 10 - x++); //5 += 10 - 2 답은 13 ++가 뒤에 붙어서 다음 부터 , +=는 뭔가?
		System.out.println(x += 2); // (2+1) += 2 ??
		System.out.println(!('A'<=c && c <= 'Z')); // !true = false
		System.out.println('C' - c); // 유니코드 C - 유니코드 A = 67 - 65 = 2
		System.out.println('5' - '0'); // 문자 5 - 문자 0 = 5
		System.out.println(c+1); // 65+1=66
		System.out.println(++c); //이번에 포함 즉 A보다 한단계 위인 B
		System.out.println(c++); //이번에 포함하지 않음 즉 B
		System.out.println(c); //대문자 A의 2번째 위인 C
		
	}

}
