package com.test.java_Review;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	float average;

	
	
	Student() {}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}
	
	String info() {
		String result = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + total() +"," +average();
		return result;
	}
	
	int total() {return kor + eng + math;}
	float average() {return (float)(kor + eng + math)/3;}
	
	
	
	
}

class Pr6_2 {
	public static void main(String [] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}

}
