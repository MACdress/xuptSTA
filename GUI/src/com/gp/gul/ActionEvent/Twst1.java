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
		b.addActionListener(m);// ����һ�������¼�,���¼�����ʱ�����¼���װ��һ�����󴫵ݸ�������
		f.add(b, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}

// һ���¼���Ӧһ���ӿڣ�ActionEvent ��Ӧ��ʱActionListener
class Monitor implements ActionListener {// ʵ�ֶ��������ӿڣ�����һ����������

	@Override
	public void actionPerformed(ActionEvent e) {// �����¼�����Ϣϵͳ�������װ�ɶ��󣬴���e����

		// TODO Auto-generated method stub
		System.out.println("Hello,World");
	}

}