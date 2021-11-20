package nongsan.webmvc.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
<<<<<<< Updated upstream:src/nongsan/webmvc/controller/admin/CategoryeDeleteController.java
=======
//import javax.servlet.annotation.WebServlet;
>>>>>>> Stashed changes:src/nongsan/webmvc/controller/admin/CategoryDeleteController.java
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nongsan.webmvc.service.CategoryService;
import nongsan.webmvc.service.impl.CategoryServicesImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/admin/cate/delete")
public class CategoryDeleteController extends HttpServlet {
	
	CategoryService cateService = new CategoryServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		cateService.delete(id);
		
		resp.sendRedirect(req.getContextPath() + "/admin/cate/list");
	}

}
