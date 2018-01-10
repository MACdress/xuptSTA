package com.gp.gul.FrameClose;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAnnoyMous {
	Frame f = new Frame("TestAnnoy");
	Button b = new Button("Command");
	TextField tf = new TextField("Start");

	public TestAnnoyMous() {
		f.add(b, BorderLayout.NORTH);
		f.add(tf, BorderLayout.SOUTH);
		b.addActionListener(new ActionListener() {
			private int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText(e.getActionCommand() + (++i));

			}
		});
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				f.setVisible(false);
				System.out.println(-1);
			}

		});
		f.setVisible(true);
		f.pack();

	}

	public static void main(String[] args) {
		new TestAnnoyMous();
	}
}
