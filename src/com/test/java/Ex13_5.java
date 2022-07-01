package com.test.java;
import javax.swing.JOptionPane;

class Ex13_5 {
	public static void main(String [] args) throws Exception {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		th1.start(); //순서대로 시행하기에 Thread가 2개라도 input과 println이 시행된 후에 시작됨
		
	}
}

class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {}
		}
	}
}
//Thread가 2개라서 동시에 작동을 시작하고 input이 입력되는 즉시 반영함