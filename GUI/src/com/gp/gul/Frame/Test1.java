package com.gp.gul.Frame;

import java.awt.Color;
import java.awt.Frame;

//基本窗口显示

public class Test1 {
	public static void main(String[] args) {
		Frame f = new Frame("Hello,World!");// newFrame的时候指定一个窗口。
		// 传输的字符串即是在Tittle Bord上面的文字
		f.setLocation(300, 300);// 设置窗口位置，x,y是左上角的左标，不设置默认（0,0）
		f.setSize(170, 100);// 设置窗口像素大小
		f.setBackground(Color.blue);// 设置背景颜色
		f.setResizable(false);// 设置窗口能否改变大小。
		f.setVisible(true);// 窗口是否可见
	}
}
