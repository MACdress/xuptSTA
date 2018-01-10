package com.xiongmao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.valves.rewrite.RewriteCond;

/**
 * ����Servlet�ǵ������̵߳ģ� �������ִ��ڿ��޸ĵĳ�Ա���������ԣ���ǰ���Servlet���̲߳���ȫ�ġ�
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String username;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		synchronized (this) {
			this.username = request.getParameter("username");// �Գ�Ա�������޸�
			PrintWriter out = response.getWriter();
			out.println("username=" + username);
		}
	}

}
/*
 * ���������
 * 1.����Ա������Ϊ�ֲ�����
 * 2.��synchronized���Ρ�
 */
