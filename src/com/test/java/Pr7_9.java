package com.test.java;
import java.awt.*;
import java.awt.event.*;


class Pr7_9 {
	public static void main(String [] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					e.getWindow().setVisible(false);
					e.getWindow().dispose();
					System.exit(0);
				}
			}
		);
	}

}
//code가 무슨 말을 하는지 하나도 모르겠음