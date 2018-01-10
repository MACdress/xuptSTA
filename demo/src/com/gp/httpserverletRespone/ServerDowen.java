package com.gp.httpserverletRespone;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerDowen
 */
@WebServlet("/ServerDowen")
public class ServerDowen extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 通过路径得到一个输入流
		String path = this.getServletContext().getRealPath("/picture/1.jpg");
		FileInputStream fis = new FileInputStream(path);
		// 创建字节输出流
		ServletOutputStream sos = response.getOutputStream();
		// 得知要下载的文件名
		String filename = path.substring(path.lastIndexOf("\\") + 1);
		// 设置文件编码
		filename = URLEncoder.encode(filename, "UTF-8");
		// 通知客户端要下载文件
		response.setHeader("content-disposition", "attachment;filename=" + filename);// 告知要下载文件
		response.setHeader("content-type", "image/jpeg");
		// 执行输出操作
		byte[] b = new byte[100];
		int len = 1;
		while ((len = fis.read(b)) != -1) {
			sos.write(b, 0, len);
		}
		sos.flush();
		sos.close();
		fis.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
