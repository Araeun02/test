package com.test.java;
import java.util.*;

class Pr11_6 {
	public static void main(String [] args) {
		Set<Integer> set = new HashSet<Integer>(); //hashset이 순서를 이상하게 한다고 했던거같은데
		int [][] board = new int[5][5];
		
		for(int i =0; set.size() < 25; i++) {
			set.add((int)(Math.random() * 30) + 1);
		}
		//섞여야대니까 정렬이되면 안되고 즉 treeset아님 list
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);
		Iterator<Integer> it = list.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}

}
