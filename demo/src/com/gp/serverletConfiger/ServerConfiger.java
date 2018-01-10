package com.gp.serverletConfiger;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServerConfiger extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;// 方式1.获取Config对象
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		String s = this.getInitParameter("encoding");// 方法2，直接得到方法
		String s2 = this.getServletConfig().getInitParameter("encoding");// 通过调用方法，得到config对象，从而得到方法
		String s3 = this.config.getInitParameter("encoding");
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
