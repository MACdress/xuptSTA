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
		f.pack();// ���ռ���İ�ť�Ȳ���Ĵ�С���������Զ����һ��������С���ǲ��֮�͵Ĵ�С;
		f.setVisible(true);
	}
}
