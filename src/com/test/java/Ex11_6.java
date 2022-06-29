package com.test.java;
import java.util.*;

class Ex11_6 {
	public static void main(String [] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr=" + Arrays.toString(arr));
		System.out.println("arr2D=" + Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);//Arrays.copyOf(복사할 배열, 복사 범위의 시작, 해당 숫자 직전까지 복사)
		int[] arr3 = Arrays.copyOf(arr, 3);//4번 전까지
		int[] arr4 = Arrays.copyOf(arr, 7);//8번째 전까지
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);//3번과 4번 복사 이유 : Arrays는 0번부터 시작
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);//1번부터 8번째 직전까지
		
		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); //arr=[9,9,9,9,9]
		System.out.println("arr7=" + Arrays.toString(arr7));
		Arrays.setAll(arr7, i -> (int)(Math.random()*6) +1); // 1부터 6까지 랜덤
		System.out.println("arr7=" + Arrays.toString(arr7));
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + i);//i의 갯수만큼 *을 찍고 + i
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		char[] chArr = { 'A','D','C','B','E'};
		
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B')); //binarySearch?
		System.out.println(" = After sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
	}

}
