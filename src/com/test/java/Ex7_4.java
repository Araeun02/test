package com.test.java;

public class Ex7_4 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
	}
}

class point {
	int x,y;
	point(int x,int y){
		this.x = x;
		this.x = y;
	}
}

class Point3D extends point{
	int z; // 오버로딩
	Point3D(int x,int y, int z){
		super(x,y);
		this.z = z;
	}
	
}
