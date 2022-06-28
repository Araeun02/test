package com.test.java;
import java.util.*;

class Ex11_2 {
	public static void main(String [] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack ="); //넣은것이 먼저 꺼내지는 구조
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= queue ="); //넣은 것이 마지막에 꺼내지는 구조
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
