package com.test.java;
import java.util.*;

class Ex14_4 {
	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			list.add(i);
		
		list.forEach(i->System.out.print(i+","));//foreach? 모든 요소 
		System.out.println();
//		System.out.println(list); //forEach랑 모양이 다름
		
		list.removeIf(x-> x%2==0 || x%3==0); // 2와 3의 배수 삭제 0이 삭제되는게 맞나?
		System.out.println(list);
		
		list.replaceAll(i->i*10); //list에 10을 곱한다.
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
//		System.out.println(map); 모양이 완전히 다름
		map.forEach((k,v) -> System.out.print("{" + k + "," + v + "},"));
		System.out.println();
		
	}

}
