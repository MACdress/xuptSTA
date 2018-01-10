package com.gp.gul.Frame.Panel;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class CenterPanel {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame(100, 100, 500, 500, Color.blue);
		mf.toString();
	}

	@Override
	public String toString() {
		return "CenterPanel [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}

class MyFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(int x, int y, int w, int h, Color color) {
		super("Frame with Panel");
		this.setVisible(true);
		Panel p = new Panel();
		p.setBounds(w / 4, h / 4, w / 2, h / 2);
		p.setBackground(Color.yellow);
		this.setLayout(null);
		p.setVisible(true);
		this.add(p);
		this.setBackground(color);
		this.setBounds(x, y, w, h);
	}
}