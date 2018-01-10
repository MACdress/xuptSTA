package com.gp.gul.Frame.Panel;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Test {
	public static void main(String[] args) {
		Frame f = new Frame("MyFirstPanel");
		Panel p = new Panel(null);
		f.setBounds(100, 100, 300, 300);
		f.setBackground(Color.lightGray);
		f.setVisible(true);
		p.setBackground(Color.red);
		p.setBounds(50, 50, 200, 200);// 相对于外层的FRAME
		f.setLayout(null);
		f.add(p);
		p.setVisible(true);
	}
}
