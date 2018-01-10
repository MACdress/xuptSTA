package com.gp.gul.Frame.LayOut;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class TestBorderLayOut {
	public static void main(String[] args) {
		Frame f = new Frame("BorderLayOut");
		Button bw = new Button("BW");
		Button bs = new Button("BS");
		Button be = new Button("BE");
		Button bn = new Button("BN");
		Button bc = new Button("BC");
		f.add(bc, BorderLayout.CENTER);
		f.add(bw, BorderLayout.WEST);
		f.add(bs, BorderLayout.SOUTH);
		f.add(be, BorderLayout.EAST);
		f.add(bn, BorderLayout.NORTH);
		f.setBounds(100, 100, 300, 300);
		f.setBackground(Color.blue);
		f.setVisible(true);
	}
}
