package com.xupt.rigisterServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.setCharacterEncoding("utf-8");
		// ����1
		// String username = request.getParameter("username");
		// String password = request.getParameter("password");
		// System.out.println("username=" + username);
		// System.out.println("password=" + password);
		// ����2
		// Enumeration<String> names = request.getParameterNames();
		// while (names.hasMoreElements()) {
		// String name = (String) names.nextElement();
		// String value = request.getParameter(name);
		// System.out.println(name + "=" + value);
		// }
		// ����3,Map��value��ֵ��String�������͵ã���Ҫ��Ϊ��checkbox����׼����
		// Map<String, String[]> map = request.getParameterMap();
		// for (String key : map.keySet()) {
		// System.out.println(key + "=" + request.getParameter(key));
		// }
		Cookie[] cookies = request.getCookies();
		cookies[0].getValue();
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameterValues("username")[0];
		String value = request.getParameterValues("username")[0];
		System.out.println("username=" + name);
		System.out.println("password=" + value);
		Cookie cookie1 = new Cookie("username", name);
		cookie1.setPath(request.getContextPath() + "/register");// ����Ҫָ���Ǹ���Ŀ
		response.addCookie(cookie1);// ����Ӧ������cookie
		PrintWriter out = response.getWriter();
		out.println("<a>Hello</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}