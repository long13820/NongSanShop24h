package nongsan.webmvc.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nongsan.webmvc.service.ProductService;
import nongsan.webmvc.service.impl.ProductServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/admin/product/delete")
public class ProductDeleteController extends HttpServlet {
	
	ProductService productService = new ProductServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		productService.delete(id);
		resp.sendRedirect(req.getContextPath() + "/admin/product/list");
	}

}
