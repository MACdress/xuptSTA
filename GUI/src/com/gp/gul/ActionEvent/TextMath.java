package com.gp.gul.ActionEvent;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextMath {
	public static void main(String[] args) {
		new TFrame().LaunthTFrame();
	}
}

class TFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 12L;
	private TextField tf1, tf2, tf3;

	public void LaunthTFrame() {
		tf1 = new TextField(10);
		tf2 = new TextField(10);
		tf3 = new TextField(15);
		Label lbPlus = new Label("+");// 一个文本
		Button button = new Button("=");
		Monitors mt = new Monitors();
		button.addActionListener(mt);
		this.setLayout(new FlowLayout());
		this.add(tf1);
		this.add(lbPlus);
		this.add(tf2);
		this.add(button);
		this.add(tf3);
		this.pack();
		this.setVisible(true);
	}

	private class Monitors implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int n1 = Integer.parseInt(tf1.getText());
			int n2 = Integer.parseInt(tf2.getText());
			int n3 = n1 + n2;
			tf3.setText("" + n3);
		}
	}
}
