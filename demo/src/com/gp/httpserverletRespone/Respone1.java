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
		// response.setContentType("UTF-8");// ���߷�������UTF-8�����ı�
		// response.setHeader("content-type", "text/html;charset=UTF-8");//
		// ���߿ͻ���Ҫ����ʲô���룬���߷�������UTF-8�����ı������������ֵĽ��
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();// �õ�һ���ַ������
		writer.write("Hello,World");// ��ͻ�����Ӧ�ı�����
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
