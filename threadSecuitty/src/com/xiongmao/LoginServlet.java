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
 * 由于Servlet是单例多线程的， 而其中又存在可修改的成员变量，所以，当前这个Servlet是线程不安全的。
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String username;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		synchronized (this) {
			this.username = request.getParameter("username");// 对成员变量的修改
			PrintWriter out = response.getWriter();
			out.println("username=" + username);
		}
	}

}
/*
 * 解决方案：
 * 1.将成员变量变为局部变量
 * 2.用synchronized修饰。
 */
