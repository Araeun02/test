package com.test.java;
import java.util.*;

class SutdaCard00 {
	int num;
	boolean isKwang;
	
	SutdaCard00() {
		this(1, true);
	}
	
	SutdaCard00(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard00) {
			SutdaCard00 c = (SutdaCard00) obj;
			return num == c.num && isKwang == c.isKwang;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
}

class Pr11_5 {
	public static void main(String [] args) {
		SutdaCard00 c1 = new SutdaCard00(3, true);
		SutdaCard00 c2 = new SutdaCard00(3, true);
		SutdaCard00 c3 = new SutdaCard00(1, true);
		
		HashSet<SutdaCard00> set = new HashSet<SutdaCard00>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
		
	}

}
