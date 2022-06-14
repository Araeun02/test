package com;
import java.util.Scanner;

public class Pr5_6 {
	public static void main(String args[]) { //String args[]랑 String [] args랑 다른거?
		String[] words = {"television","computer","mouse","phone"};	
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < words.length; i++){
			char[] question = words[i].toCharArray(); //String을 char[]로 변환
			//Math.random을 쓰면 안되는거같은데

			for (int j=0; j<question.length; j++) {
				int n = (int)(Math.random() * question.length);
				char tmp = question[j];
				question[j] = question[n];
				question[n] = tmp;
			}
			
			
			System.out.printf("Q%d.%s의 정답을 입력하세요.>",i+1,new String(question));
			String answer = scanner.nextLine();
		
			if(words[i].equals(answer.trim()))
			System.out.printf("맞았습니다.%n%n");
			else
			System.out.printf("틀렸습니다.%n%n");
		}
	}
}
