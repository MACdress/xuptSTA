package com.xupt.gp.Request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo3
 */
@WebServlet("/RequestDemo3")
public class RequestDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = "aaa";
		System.out.println("Hello!");
		request.setAttribute("s", str);// requestҲ��һ������Ҳ��һ��map'���ϣ���������ת���Ǳ�����
		// request.getRequestDispatcher("/RequestDemo4").forward(request,
		// response);����ת��
		// response.sendRedirect("/demo/RequestDemo4");
		request.getRequestDispatcher("/RequestDemo4").include(request, response);// �������
		System.out.println("it's my World!");
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
