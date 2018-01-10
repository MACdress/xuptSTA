package com.gp.gul.Frame.LayOut;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class ZongHe {
	public static void main(String[] args) {
		int w = 300;
		int h = 300;
		MyFrame m1 = new MyFrame(w / 2, h, 1, 2);
		MyFrame m2 = new MyFrame(w / 2, h, 2, 2);
		Frame f = new Frame("TenButton");
		f.setBounds(100, 100, w, h);
		f.setLayout(new GridLayout(2, 1));
		f.add(m1);
		f.add(m2);
		f.pack();
		f.setVisible(true);
	}
}

class MyFrame extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(int w, int h, int rows, int cols) {
		this.setSize(w, h);
		this.setLayout(new GridLayout(1, 3));
		Button b1 = new Button("Button");
		Panel f1 = new Panel();
		f1.setLayout(new GridLayout(cols, rows));
		Button[] b = new Button[cols * rows];
		f1.setSize((w * 3) / 4, h);
		for (int i = 0; i < (cols * rows); i++) {
			b[i] = new Button("Button");
			f1.add(b[i]);
		}
		Button b2 = new Button("Button");
		this.add(b1);
		this.add(f1);
		this.add(b2);
	}
}