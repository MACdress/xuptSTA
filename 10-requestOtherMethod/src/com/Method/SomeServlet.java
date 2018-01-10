package com.Method;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomeServlet
 */
@WebServlet("/SomeServlet")
public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 这里接收到的name，其字符编码为ISO8859-1
		String name = request.getParameter("name");
		// 打散：将name字符串按照指定字符编码进行打散
		byte[] bytes = name.getBytes("ISO8859-1");
		// 组装:将bytes字节数组按照指定字符编码进行组装，组装为String
		name = new java.lang.String(bytes, "UTF-8");
		doGet(request, response);
	}

}
