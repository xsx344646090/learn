package com.xsx.shiro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if (userName == null && password == null) {
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(
					request, response);
			return;
		}
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(userName,
				password);
		StringBuilder msg = null;
		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			msg = new StringBuilder("用户名错误！");
		} catch (IncorrectCredentialsException e) {
			msg = new StringBuilder("密码错误！");
		}
		if (msg == null) {
			response.sendRedirect(request.getContextPath() + "/");
		} else {
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(
					request, response);
		}
	}

}
