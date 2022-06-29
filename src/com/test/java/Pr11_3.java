package com.test.java;
import java.util.*;

class Student00 implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student00(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10 + 0.5)/10f;
	}
	
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	public int compareTo(Object name) {

		return 0;
	}
}

class Pr11_3 {
	public static void main(String [] args) {
		ArrayList list = new ArrayList();
		list.add(new Student00("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student00("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student00("김자바", 1, 3, 80, 80, 90));
		list.add(new Student00("이자바", 1, 4, 70, 90, 70));
		list.add(new Student00("안자바", 1, 5, 60, 100, 80));
		
		TreeSet tset = new TreeSet(list);
		
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
//name으로 기본 정렬 TreeSet?