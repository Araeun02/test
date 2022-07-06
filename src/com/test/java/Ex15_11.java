package com.test.java;
import java.io.*;

class Ex15_11 {
	public static void main(String [] args) { //그러고보니 main은 생략되네
		try {
			FileReader fr = new FileReader(".\\src\\com\\test\\java\\Ex15_11.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for(int i = 1; (line = br.readLine()) != null; i++){
				if(line.indexOf(";") != -1)
					System.out.println(i + ":" + line);
			}
			
			br.close();
		} catch(IOException e) {} //얘도 생략
	}

}
