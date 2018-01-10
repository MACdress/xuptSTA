package com.gp.gul.Test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyFrame {
	public static void main(String[] args) {
		new KeyOfFrame().lauchFrame("KeyFrame");
	}
}

class KeyOfFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void lauchFrame(String s) {
		setBounds(300, 300, 500, 500);
		setBackground(Color.black);
		addKeyListener(new Monior());
		setVisible(true);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				System.out.println(-1);
			}

		});
	}

	class Monior extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			// super.keyPressed(e);
			int k = e.getKeyCode();
			if (k == KeyEvent.VK_UP) {
				System.out.println("UP");
			}
		}

	}
}