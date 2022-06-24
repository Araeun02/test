package com.test.java;

public class Ex9_12 {
	public static void main(String [] args) {
		StringBuffer sb = new StringBuffer("01");
		System.out.println("sb =" + sb);//현제 sb = 01
		StringBuffer sb2 = sb.append(23); //sb = sb2 = 0123
		System.out.println("sb =" + sb); // sb = 0123
		sb.append('4').append(56);  // sb = sb2 = sb3 = 0123456
		System.out.println("sb =" + sb); //sb = 0123456
		StringBuffer sb3 =sb.append(78); 
		System.out.println("sb =" + sb); //sb = 012345678
		sb3.append(9.0);
		System.out.println("sb =" + sb); //sb = 0123456789.0
		System.out.println("sb2 =" + sb2); 
		System.out.println("sb3 =" + sb3); 
		System.out.println("sb=" + sb.deleteCharAt(10)); //10번째 Char을 삭제 0123456789.10 중에서 10번째인 . 을 삭제 sb = 01234567890
		System.out.println("sb =" + sb.delete(3,6)); //3번째부터 6번째 직전까지 삭제 01234567890 중에서 345를 삭제하여 sb = 01267890
		System.out.println("sb =" + sb.insert(3,"abc")); //3번째에 "abc를 살입, sb = 012abc67890
		System.out.println("sb=" + sb.replace(6,sb.length(),"END")); //012abc67890 중에서 6번째부터 끝까지를(67890)를 삭제하고 END를 삽입 즉 sb = 012abcEND
		System.out.println("capacity=" + sb.capacity()); //글자 하나당 2Byte 즉 9*2byte sb.capacity = 18Byte
		System.out.println("length=" + sb.length()); //글자의 수 9개
	}

}
