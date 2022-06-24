package com.test.java;

class Pr9_2 {
	public static void main(String [] args) {
		Point3D0 p1 = new Point3D0(1,2,3);
		Point3D0 p2 = new Point3D0(1,2,3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
	}
}

class Point3D0 {
	int x,y,z;
	
	Point3D0(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point3D0() {
		this(0,0,0);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point3D0) {
			Point3D0 a = (Point3D0)obj;
			return (x==a.x) && (y==a.y) && (z==a.z);
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		
		return "[" + x + "," + y + "," + z + "]";
		
	}
}
