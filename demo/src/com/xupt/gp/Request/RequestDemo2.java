package com.xupt.gp.Request;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.xupt.gp.User;

/**
 * Servlet implementation class RequestDemo2
 */
@WebServlet("/RequestDemo2")
public class RequestDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// text1(request);
		// text2(request);
		User u = new User();
		request.setCharacterEncoding("UTF-8");
		System.out.println(u);
		// text3(request, u);
		try {
			BeanUtils.populate(u, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(u);
	}

	@SuppressWarnings("unused")
	private void text3(HttpServletRequest request, User u) {
		Map<String, String[]> map = request.getParameterMap();
		for (Entry<String, String[]> temp : map.entrySet()) {
			String name = temp.getKey();
			String[] value = temp.getValue();
			if (value != null) {
				// 创建一个属性描述器
				PropertyDescriptor pd = null;
				try {
					pd = new PropertyDescriptor(name, User.class);
				} catch (IntrospectionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Method write = pd.getWriteMethod();
				if (value.length == 1) {
					try {
						write.invoke(u, value[0]);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					try {
						write.invoke(u, (Object) value);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	@SuppressWarnings("unused")
	private void text2(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String element = names.nextElement();
			String[] values = request.getParameterValues(element);
			for (int i = 0; values != null && i < values.length; i++) {
				System.out.println(element + "\t" + values[i]);
			}
		}
	}

	@SuppressWarnings("unused")
	private void text1(HttpServletRequest request) throws UnsupportedEncodingException {
		// 获取表单数据
		// 告诉服务器是用什么编码
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		String password = request.getParameter("psw");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");// 为复选框提供的方法
		String city = request.getParameter("city");
		System.out.println(name);
		System.out.println(password);
		System.out.println(sex);
		for (int i = 0; hobby != null && i < hobby.length; i++) {
			System.out.print(hobby[i] + "  ");
		}
		System.out.println();
		System.out.println(city);
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
