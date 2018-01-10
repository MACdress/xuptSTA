package com.gp.gul.Paint;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class TextPaint {
	public static void main(String[] args) {
		new PaintFrame().launchFrame();
	}
}

class PaintFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void launchFrame() {
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fill3DRect(50, 50, 100, 100, true);
		g.setColor(Color.black);
		g.draw3DRect(200, 200, 200, 200, false);
		g.setColor(c);// ª÷∏¥œ÷≥°
	}

}