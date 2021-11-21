package nongsan.webmvc.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nongsan.webmvc.service.BoardnewService;
import nongsan.webmvc.service.impl.BoardnewServicesImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/admin/new/delete")
public class BoardnewDeleteController extends HttpServlet{

	BoardnewService boardnewService = new BoardnewServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		boardnewService.delete(Integer.parseInt(id));
		resp.sendRedirect(req.getContextPath() + "/admin/new/list");
	}

}