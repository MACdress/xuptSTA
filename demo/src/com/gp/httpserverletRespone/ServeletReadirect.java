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
		System.out.println("�յ�û"); 
		// response.setStatus(302);//���߷�����Ҫ���ض���
		// response.setHeader("location", "/demo/ServeletAnswer");//���������ȥ�ĸ�URL
		// �������仰�����ۺ�Ϊһ��,ʵ����������������й���
		response.sendRedirect("/demo/ServeletAnswer");
		System.out.println("�Ǿͺ�");
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
