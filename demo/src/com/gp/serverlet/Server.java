package com.gp.serverlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Server implements Servlet {
	// �������ڷ���:ʵ��������
	// ��һ�η��ʵ�ʱ�򱻵���
	public Server() {
		System.out.println("*********ʵ����");
	}

	// �������ڷ���:����
	// Ӧ�ñ�ж�����ٵ�ʱ������
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("**********����");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	// �������ڷ�������ʼ��
	// ��һ�η��ʵ�ʱ�����
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("***********��ʼ��");
	}

	// �������ڷ��������ʵķ���
	// ÿ�η��ʶ������
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg1.getWriter().write("*********I'm xiongmao");
	}

}
