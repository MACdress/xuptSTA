package com.gp.httpserverletRespone;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServeletReadirect
 */
@WebServlet("/ServeletReadirect")
public class ServeletReadirect extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("收到没"); 
		// response.setStatus(302);//告诉服务器要求重定向
		// response.setHeader("location", "/demo/ServeletAnswer");//告诉浏览器去哪个URL
		// 以上两句话可以综合为一句,实现了以上两句的所有功能
		response.sendRedirect("/demo/ServeletAnswer");
		System.out.println("那就好");
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
