package com.test.java;
import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
class Ex12_8 {
	public static void main(String [] args) {
		Class<Ex12_8> cls = Ex12_8.class; //클래스 자체가 객체?
		
		TestInfo anno = cls.getAnnotation(TestInfo.class); //애너테이션을 실행?
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd()); //mm = minutes고 MM = Month아니었나? ans : DateTime을 보면 내가 직접 만든 것이라서 상관없다
		System.out.println("anno.testDate().hhmmss() = " + anno.testDate().hhmmss());
		
		for(String str : anno.testTools())
			System.out.println("testTool=" + str);
		
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
	int 	 count()	 default 1;
	String	 testedBy();
	String[] testTools() default "JUnit";
	TestType testType()	 default TestType.FIRST;
	DateTime testDate();
} //오류?

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }