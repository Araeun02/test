package com.test.java;
import java.util.*;

class Pr11_1 {
	public static void main(String [] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		System.out.println(list);//list = 3,6,2,2,2,7
		HashSet set = new HashSet(list); //hashSet으로 변환하는 도중에 중복된 2를 삭제
		System.out.println(set); //[3, 6, 2, 7] 중요! 아닌가? 왜?
		TreeSet tset = new TreeSet(set); //저장할때 정렬
		System.out.println(tset);//[2, 3, 6, 7] 
		Stack stack = new Stack();
		stack.addAll(tset); //들어간 순서대로 들어가서 쌓아라 즉 밑에서 위로 7, 6, 3, 2 <=> Queue(먼저들어간게 먼저나옴)
		
		while(!stack.empty())
			System.out.print(stack.pop());
	}
	//stack은 쌓는거라서 먼저들어간게 마지막에 나옴
}
