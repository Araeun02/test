package com.test.java;
import java.util.*;

public class Ex11_1 {
	public static void main(String [] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));//1뒤부터 4번까지 list2에 저장
		print(list1, list2);
		
		Collections.sort(list1); //정렬
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));//list2의 내용물을 list1이 모두 가지고 있을시 containAll = true
		
		list2.add("B");
		list2.add("C"); //list2 = [0, 2, 4, B, C]
		list2.add(3, "A");//3번째 위치의 뒤에 A추가 
		print(list1, list2);
		
		list2.set(3, "AA");//3번째 위치의 뒤에 있는 것을 "AA로 변경, 변경할때는 set(순서, "바꿀 내용")
		print(list1,list2);
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2)); //list1과 list2의 공통점만 남기고 나머지 삭제, 변화가 있엇다면 true, 없었다면 false
		
		print(list1, list2);
		
		for(int i = list2.size() - 1; i >= 0; i--) { //list2에 list1과 같은 내용이 있다면 삭제
			if(list1.contains(list2.get(i)))
				list2.remove(i); // 오류 0이 삭제안됨
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}

}
