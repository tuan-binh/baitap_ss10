package ra;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "discount", value = "/discount")
public class Discount extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		float price = Float.parseFloat(req.getParameter("price"));
		float discount = Float.parseFloat(req.getParameter("discount"));
		double result = price * discount * 0.01;
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<h1>Giá: " + price + "</h1>");
		out.println("<h1>Chiết Khấu: " + discount + " %</h1>");
		out.println("<h1>Giá Sau Chiết Khấu: " + (price - result) + " Đ</h1>");
		out.println("</html>");
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}
}
