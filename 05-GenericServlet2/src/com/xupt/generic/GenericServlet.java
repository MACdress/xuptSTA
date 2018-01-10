package com.xupt.generic;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//模板方法设计模式（较为简单）这个就是系统自带的GenericServlet中的源码
public abstract class GenericServlet implements Servlet, ServletConfig {
	private ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
		init();
	}

	public void init() throws ServletException {

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	// 抽象方法，让子类实现
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
