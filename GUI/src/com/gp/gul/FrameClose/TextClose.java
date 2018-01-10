package com.gp.gul.FrameClose;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextClose {
	public static void main(String[] args) {
		new MyFrameClose("MyFrameClose");
	}
}

class MyFrameClose extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrameClose(String s) {
		super(s);
		setBounds(100, 100, 500, 500);
		setBackground(Color.blue);
		setVisible(true);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				MyFrameClose mf = (MyFrameClose) e.getSource();
				mf.setVisible(false);
				System.out.println(-1);
			}

		});// ���������࣬Ҳ�Ǿֲ��ࡣͨ��д�벻�����Ķ������������ٵķ���
	}
}
