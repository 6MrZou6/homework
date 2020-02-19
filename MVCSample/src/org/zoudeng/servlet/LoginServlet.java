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

	//控制器层，接收view请求，并分发给Model处理
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//处理登录
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("uname");
		String pwd=request.getParameter("upwd");
		Login login=new Login(name,pwd);
		
	//调用模型层的登录功能
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
