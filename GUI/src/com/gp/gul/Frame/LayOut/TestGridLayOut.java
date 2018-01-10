package com.gp.gul.Frame.LayOut;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class TestGridLayOut {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayOut");
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		f.setLayout(new GridLayout(1, 3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.pack();// 按照加入的按钮等插件的大小，在外面自动打成一个包。大小就是插件之和的大小;
		f.setVisible(true);
	}
}
