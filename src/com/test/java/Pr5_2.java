package com.test.java;

public class Pr5_2 {
	public static void main(String[]args) {
		int[][] arr = {
			{5,5,5,5,5},
			{10,10,10},
			{20,20,20,20},
			{30,30}		
			}; // 세로 0 1 2 3 중 3+1번째 즉 4번째의 길이 {30,30}의 길이 = 2
			System.out.println(arr[3].length);
	}
}
