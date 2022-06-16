package com.test.java;

public class Pr6_17 {
	
	public static int[] shuffle(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			int n = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i] = arr[n];
			arr[n] = tmp;
		}
		
		/*for(int x = 0; x < arr.length; x++) {
			arr[x] = (int)(Math.random()*10)+1;*/
		
	
	/*shuffle(int[] arr) { //반환값 int[]로 void는 사용안함 맞긴한가?
		for(int x = 0; x < arr.length; x++) {
			arr[x] = (int)(Math.random()*10)+1;//1과 10사이의 임의의 값을 배열 arr [x]에 저장
			//반환 하는 방법을 아예 모르겠음
			return result;
			//여기서 더 어떻게 하는건지 전혀 모르겠음
		}*/
		
		return arr;
	}
	
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int [] result = shuffle(original); //shuffle(original)
		System.out.println(java.util.Arrays.toString(result));
	}

}
