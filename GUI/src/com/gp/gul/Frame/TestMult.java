package com.gp.gul.Frame;

import java.awt.Color;
import java.awt.Frame;

//多窗口显示
public class TestMult {
	public static void main(String[] args) {
		new MyFrame(100, 100, 200, 200, Color.black);
		new MyFrame(300, 100, 200, 200, Color.blue);
		new MyFrame(100, 300, 200, 200, Color.cyan);
		new MyFrame(300, 300, 200, 200, Color.darkGray);

	}
}

class MyFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int id = 0;

	public MyFrame(int x, int y, int w, int h, Color color) {
		super("MyFrame" + (++id));
		setBackground(color);
		setBounds(x, y, w, h);
		setVisible(true);
		setLayout(null);// 布局管理器设置为空
	}
}