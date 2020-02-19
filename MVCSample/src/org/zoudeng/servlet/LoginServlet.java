package org.zoudeng.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zoudeng.dao.LoginDao;
import org.zoudeng.entity.Login;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	//�������㣬����view���󣬲��ַ���Model����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//�����¼
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("uname");
		String pwd=request.getParameter("upwd");
		Login login=new Login(name,pwd);
		
	//����ģ�Ͳ�ĵ�¼����
		int result=LoginDao.login(login);
		if(result==1) {
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
