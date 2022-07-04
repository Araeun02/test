package com.test.java_Review;
import java.util.Scanner;

class Pr5_6 {
	public static void main(String [] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		char tmp = 0;
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int x = 0; x < question.length; x++) {
				tmp = question[x];
				int y = (int)(Math.random() * question.length);
				question[x] = question[y];
				question[y] = tmp;
				
			}
			
			System.out.printf("Q%d.%s의 정답을 입력하세요.>", i+1, new String(question));
			
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim()))
				System.out.println("정답");
			else
				System.out.println("틀림");
				
		}	
	}

}
