package com.gp.serverlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Server implements Servlet {
	// 生命周期方法:实例化对象
	// 第一次访问的时候被调用
	public Server() {
		System.out.println("*********实例化");
	}

	// 生命周期方法:销毁
	// 应用被卸载销毁的时候会调用
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("**********销毁");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	// 生命周期方法：初始化
	// 第一次访问的时候调用
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("***********初始化");
	}

	// 生命周期方法：访问的方法
	// 每次访问都会调用
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg1.getWriter().write("*********I'm xiongmao");
	}

}
