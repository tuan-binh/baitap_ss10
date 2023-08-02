package ra;

import com.example.momo.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet",value = "/LoginServlet")
public class LoginServlet extends HelloServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		super.doGet(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doPost(req, resp);
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		
		if ("admin".equals(username) && "admin".equals(password)) {
			writer.println("<h1>Welcome " + username + " to website</h1>");
		} else {
			writer.println("<h1>Login Error</h1>");
		}
		
		writer.println("</html>");
		
	}
}
