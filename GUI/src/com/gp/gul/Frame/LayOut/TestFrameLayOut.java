package com.gp.gul.Frame.LayOut;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class TestFrameLayOut {
	public static void main(String[] args) {
		Frame frame = new Frame("TestFrameLayOut");
		frame.setBounds(100, 200, 500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));// 布局管理器，设置对齐方式、水平间距、垂直间距
		Button b1 = new Button("OK");
		b1.setBackground(Color.magenta);
		b1.setBounds(0, 0, 100, 100);
		Button b2 = new Button("open");
		b2.setBounds(50, 50, 100, 100);
		b2.setBackground(Color.blue);
		Button b3 = new Button("Close");
		b3.setBounds(50, 50, 100, 100);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		frame.setBackground(Color.black);
	}
}
