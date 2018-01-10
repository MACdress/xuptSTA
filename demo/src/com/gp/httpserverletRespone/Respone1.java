package com.gp.httpserverletRespone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Respone1
 */
@WebServlet("/Respone1")
public class Respone1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Respone1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.setContentType("UTF-8");// 告诉服务器用UTF-8解析文本
		// response.setHeader("content-type", "text/html;charset=UTF-8");//
		// 告诉客户端要是用什么编码，告诉服务器用UTF-8解析文本，即以上两种的结合
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();// 得到一个字符输出流
		writer.write("Hello,World");// 向客户端响应文本内容
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
