package com.test.java;
import javax.swing.JOptionPane; //대화상자 팝업

class Ex13_4 {
	public static void main(String [] args) throws Exception {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); //showInputDialog(입력받을 대화창을 띄움) 
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //Thread.sleep(지연할 시간) 기본값이 millisecond(1000분의 1초) 즉 1초 지연 = sleep(지연할 시간)
			} catch(Exception e) {}
		}
	}

}
//위에서부터 순서대로 내려가기에 input부터 쓰고 for문이 돌면서 시간을 계산