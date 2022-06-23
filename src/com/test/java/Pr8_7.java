package com.test.java;
import java.util.*;

public class Pr8_7 {
	public static void main(String [] args) {
		int answer = (int)(Math.random() *100) +1;
		int input = 0;
		int count =0;
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 :");
			
			input = inputStr();
			if (input == -1) {
				continue;
			}
			
			/*try {
				input = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력이 가능합니다.");
				continue;
			}*/
			
			/*inputch();
			
			try { input //str
				
			}*/
			
			
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("정답");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break;
			}
		} while(true);
	}
	
	static int inputStr() throws InputMismatchException {
		int input = 0;
		try {
			input = new Scanner(System.in).nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력이 가능합니다.");
			input = -1;
		}
		
		return input;
	}
	
	static boolean inputch(String input) {
		for(int x =0; x<input.length(); x++) {
			char ch = input.charAt(x);
			if(!(ch>= '0' && ch <= '9'))
				return false;
		}
		return true;
	}

}
