
package com.test.java;

class Student {
	String name; //홍길동
	int ban; //반
	int no; //번호
	int kor; //국어
	int eng; //영어
	int math; //수학
	int getTotal; //총점
	int getAverage; //평균
	//7 ?? 
	// 설명?
	
	Student() {}
	//public은 어떨때 쓰는거?
	public Student(String string, int a, int b, int c, int d, int e, int f, int g, int h) {
		name = string;
		ban = a;
		no = b;
		kor = c;
		eng = d;
		math = e;
		getTotal = f;
		getAverage = g;

	}

		public int getTotal() {
			//kor+eng+math;
			return getTotal;
		} 
	
		public int getAverage() {
			//getTotal/
			return getAverage;
		}


}
//class info를 추가?

//class info {