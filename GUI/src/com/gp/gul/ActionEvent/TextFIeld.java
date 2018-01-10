package com.gp.gul.ActionEvent;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFIeld {

	public static void main(String[] args) {
		new TFFrame();
	}
}

class TFFrame extends Frame {

	/**
	 * TextField是对话框形式的元素
	 */
	private static final long serialVersionUID = 1L;

	public TFFrame() {
		TextField tf = new TextField("请输入要输入的内容");
		TFActionLinister tfa = new TFActionLinister();
		tf.addActionListener(tfa);
		tf.setEchoChar('*');// 设置回显字符
		add(tf);
		pack();
		setVisible(true);
	}
}

class TFActionLinister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		TextField tf = (TextField) e.getSource();// 获得事件的源对象
		System.out.println(tf.getText());// 输出时间内的内容
		tf.setText("");// 设置为空
	}
}