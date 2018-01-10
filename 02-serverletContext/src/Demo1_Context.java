import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo1_Context implements Servlet {
	private ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取ServletContext对象
		ServletContext context = config.getServletContext();// 通过Config获得Context

		// 获取所有初始化参数名
		Enumeration<String> names = context.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = context.getInitParameter(name);// 获取参数的值
			System.out.println(name + "=" + value);
		}

		// 设置域属性(是全局性的).
		context.setAttribute("gaopan", "735159088");
		context.setAttribute("value", "global");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
