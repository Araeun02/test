package com.test.java;

class Pr9_5 {
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			if (delCh.indexOf(ch) == -1)
				sb.append(ch);
		}
		
		return sb.toString();
		
		/*for(int x=0; x < src.length(); x++;) {
			charAt(int x) = ch;
			if("0" < ch && ch < "9") {
				return delChar;
			} else {
				return delCh;
			}*/

	}
	
	


	public static void main(String [] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t 5)"," \t"));
	}

}
