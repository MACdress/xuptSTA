package com.gpp.Context;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Context_Demo3 implements Servlet {
	private ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// 获取域属性对象-
		ServletContext context = config.getServletContext();
		String value1 = (String) context.getAttribute("gaopan");
		String value2 = (String) context.getAttribute("value");
		System.out.println("gaopan =" + value1);
		System.out.println("value=" + value2);

		// 获取项目名称（/02-serverletContext)
		String path = context.getContextPath();
		System.out.println(path);

		//获取到path的真实路径，这个是基于本地磁盘的
		String path2 = context.getRealPath(path);
		System.out.println(path2);
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {

	}

}
