package com.gpp.Context;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Context_Demo2 implements Servlet {
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

		// 获取域属性中的值
		ServletContext context = config.getServletContext();
		String value = (String) context.getAttribute("gaopan");
		System.out.println("gaopan" + "=" + value);
		String value1 = (String) context.getAttribute("value");
		System.out.println("value" + "=" + value1);

		// 重置域属性的值
		context.setAttribute("gaopan", "good");

		// 移除域属性的值
		context.removeAttribute("value");
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {

	}

}
