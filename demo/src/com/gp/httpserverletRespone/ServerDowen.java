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
		// ͨ��·���õ�һ��������
		String path = this.getServletContext().getRealPath("/picture/1.jpg");
		FileInputStream fis = new FileInputStream(path);
		// �����ֽ������
		ServletOutputStream sos = response.getOutputStream();
		// ��֪Ҫ���ص��ļ���
		String filename = path.substring(path.lastIndexOf("\\") + 1);
		// �����ļ�����
		filename = URLEncoder.encode(filename, "UTF-8");
		// ֪ͨ�ͻ���Ҫ�����ļ�
		response.setHeader("content-disposition", "attachment;filename=" + filename);// ��֪Ҫ�����ļ�
		response.setHeader("content-type", "image/jpeg");
		// ִ���������
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
