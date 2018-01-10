package com.gp.gul.ActionEvent;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Twst1 {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Button b = new Button("Press me");
		Monitor m = new Monitor();
		b.addActionListener(m);// 监听一个动作事件,当事件发生时，将事件封装成一个对象传递给监听器
		f.add(b, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}

// 一个事件对应一个接口，ActionEvent 对应的时ActionListener
class Monitor implements ActionListener {// 实现动作监听接口，定义一个监听器类

	@Override
	public void actionPerformed(ActionEvent e) {// 关于事件的信息系统会把它封装成对象，传到e里面

		// TODO Auto-generated method stub
		System.out.println("Hello,World");
	}

}