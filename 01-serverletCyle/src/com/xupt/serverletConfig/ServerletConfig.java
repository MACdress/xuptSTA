package com.xupt.serverletConfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServerletConfig implements Servlet {
	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ��ȡServerlet����
		String name = config.getServletName();
		System.out.println("ServletConfig=" + name);

		// ��ȡServletContext����
		ServletContext servletContext = config.getServletContext();
		System.out.println("ServerletContext=" + servletContext);

		// ��ȡ���еĳ�ʼ����Ϣ
		Enumeration<String> initNames = config.getInitParameterNames();
		while (initNames.hasMoreElements()) {
			String name1 = (String) initNames.nextElement();
			String value = config.getInitParameter(name1);
			System.out.println(name1 + "=" + value);
		}
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
