package com.test.java;
import java.util.*;

class Ex11_12 {
	public static void main(String [] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		//숫자 한번에는 못넣나? 
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("b = " + setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();//setB를 tmp에 넣고 
			if(setA.contains(tmp))//SetA.contains(tmp)로 공통된 숫자만 출력 근데 setA.contain(setB)의 형태는 불가능?
				setKyo.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next(); // SetA를 tmp에 넣고
			if(!setB.contains(tmp)) //?? 이해안감 4,5가 빠져야되는거 아닌가?
				setCha.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪  B = " + setHab);
		System.out.println("A - B = " + setCha);
		
	}

}
