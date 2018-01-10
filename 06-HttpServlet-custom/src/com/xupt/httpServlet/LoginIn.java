package com.xupt.httpServlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginIn extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("aaa");
		HttpServletRequest request = (HttpServletRequest) req;
		@SuppressWarnings("unused")
		HttpServletResponse response = (HttpServletResponse) res;

		// 获取请求的提交方式
		@SuppressWarnings("unused")
		String method = request.getMethod();
	}

}
