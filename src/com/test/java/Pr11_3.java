package com.test.java;
import java.util.*;

class Student00 implements Comparable<Student00> {
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

	public int compareTo(Student00 o) {
		return name.compareTo(o.name);
	}
}

class BanNoAscending implements Comparator<Student00> {
	public int compare(Student00 s1, Student00 s2) {
		int result = s1.ban - s2.ban;
		
		if (result == 0)
			result = s1.no - s2.no;
		
		return result;
		//return ((Integer)s1.ban).compareTo((Integer.valueOf(s2.ban))); // 반비교 그럼 
	}
}

public class Pr11_3 {
	public static void main(String [] args) { //이건 왜 오류?
		ArrayList<Student00> list = new ArrayList<Student00>();
		list.add(new Student00("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student00("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student00("김자바", 1, 3, 80, 80, 90));
		list.add(new Student00("이자바", 1, 4, 70, 90, 70));
		list.add(new Student00("안자바", 1, 5, 60, 100, 80));
		
		Collections.sort(list);
		Iterator<Student00> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
}
//name으로 기본 정렬 TreeSet?