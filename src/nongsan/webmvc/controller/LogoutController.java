package nongsan.webmvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings({ "serial", "unused" })
@WebServlet(urlPatterns = "/view/client/logout")
public class LogoutController extends HttpServlet {
	
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession session = req.getSession(false);
		 if (session != null) {
			 session.removeAttribute("username"); //remove session
		 }
		 resp.sendRedirect(req.getContextPath() + "/"); 
	}

}
