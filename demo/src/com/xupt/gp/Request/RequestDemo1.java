package com.xupt.gp.Request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo1
 */
@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		test1(request);
		test2(request);
		// �����ص�������Ϣͷ
		Enumeration<String> headers = request.getHeaders("accept-language");
		while (headers.hasMoreElements()) {
			String element = headers.nextElement();
			System.out.println(element + ":" + request.getHeader(element));
		}
	}

	private void test2(HttpServletRequest request) {
		// �������������Ϣͷ��name
		Enumeration<String> names = request.getHeaderNames();
		while (names.hasMoreElements()) {
			String element = names.nextElement();// ��һ����Ϣͷ
			System.out.println(element + ":" + request.getHeader(element));// �����Ϣ
		}
	}

	private void test1(HttpServletRequest request) {
		// ���ָ��������Ϣͷ����Ϣ
		String header = request.getHeader("User-Agent");
		if (header.toLowerCase().contains("mise")) {
			System.out.println("��ʹ�õ���IE�����");
		} else {
			System.out.println("��ʹ�õ����ѹ������");
		}
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
