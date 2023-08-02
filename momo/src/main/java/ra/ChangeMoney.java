package ra;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "convert-money", value = "/convert")
public class ChangeMoney extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		float rate = Float.parseFloat(req.getParameter("rate"));
		float usd = Float.parseFloat(req.getParameter("usd"));
		float vnd = usd * rate;
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<h1>Rate: " + rate + "</h1>");
		out.println("<h1>USD: " + usd + "</h1>");
		out.println("<h1>VND: " + vnd + "</h1>");
		out.println("</html>");
	}
}
