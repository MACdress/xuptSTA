package com.gp.gul.Frame;

import java.awt.Color;
import java.awt.Frame;

//����������ʾ

public class Test1 {
	public static void main(String[] args) {
		Frame f = new Frame("Hello,World!");// newFrame��ʱ��ָ��һ�����ڡ�
		// ������ַ���������Tittle Bord���������
		f.setLocation(300, 300);// ���ô���λ�ã�x,y�����Ͻǵ���꣬������Ĭ�ϣ�0,0��
		f.setSize(170, 100);// ���ô������ش�С
		f.setBackground(Color.blue);// ���ñ�����ɫ
		f.setResizable(false);// ���ô����ܷ�ı��С��
		f.setVisible(true);// �����Ƿ�ɼ�
	}
}
