package com.test.java;
import java.util.*;

class Ex11_9 {
	public static void main(String [] args) {
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"}; //"1"은 String, new Integer(1)은 integer은 integer의 인스턴스
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); //set에 저장
		}
		
		System.out.println(set); //중복된 값이 제외됨
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
