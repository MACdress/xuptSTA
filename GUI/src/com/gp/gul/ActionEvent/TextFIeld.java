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
	 * TextField�ǶԻ�����ʽ��Ԫ��
	 */
	private static final long serialVersionUID = 1L;

	public TFFrame() {
		TextField tf = new TextField("������Ҫ���������");
		TFActionLinister tfa = new TFActionLinister();
		tf.addActionListener(tfa);
		tf.setEchoChar('*');// ���û����ַ�
		add(tf);
		pack();
		setVisible(true);
	}
}

class TFActionLinister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		TextField tf = (TextField) e.getSource();// ����¼���Դ����
		System.out.println(tf.getText());// ���ʱ���ڵ�����
		tf.setText("");// ����Ϊ��
	}
}