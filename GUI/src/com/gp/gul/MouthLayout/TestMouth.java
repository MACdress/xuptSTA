package com.gp.gul.MouthLayout;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouth {
	public static void main(String[] args) {
		new MouseFrame("MouseFrame");
	}
}

class MouseFrame extends Frame {

	/**
	 * 
	 */
	private ArrayList<Point> p = null;
	private static final long serialVersionUID = 1L;

	public MouseFrame(String s) {
		super(s);
		this.setLayout(null);
		this.p = new ArrayList<Point>();
		this.setBounds(100, 100, 500, 500);
		this.setBackground(Color.gray);
		this.setVisible(true);
		this.addMouseListener(new MouseThings());
	}

	private void addPoint(Point temp) {
		this.p.add(temp);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Iterator<Point> i = this.p.iterator();
		while (i.hasNext()) {
			Point p = i.next();
			g.setColor(Color.black);
			g.fillOval(p.x, p.y, 5, 5);
		}
	}

	private class MouseThings extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			MouseFrame mf = (MouseFrame) e.getSource();
			mf.addPoint(new Point(e.getX(), e.getY()));
			mf.repaint();// 先调用update（），在调用Point，二级缓存
		}
	}
}