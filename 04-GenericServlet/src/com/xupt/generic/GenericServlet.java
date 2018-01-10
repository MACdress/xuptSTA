package com.xupt.generic;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//���������ģʽ-->ȱʡ���������ģʽ����Ϊ�򵥣�
public abstract class GenericServlet implements Servlet, ServletConfig {
	private ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	// ���󷽷���������ʵ��
	@Override
	public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getServletName() {
		// TODO Auto-generated method stub
		return getServletConfig().getServletName();
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return getServletConfig().getServletContext();
	}

	@Override
	public String getInitParameter(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return getServletConfig().getInitParameterNames();
	}

}
