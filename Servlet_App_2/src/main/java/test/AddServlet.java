package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/ad")
public class AddServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		  int x = Integer.parseInt(req.getParameter("v1"));
		  int y = Integer.parseInt(req.getParameter("v2"));
		  int z =x+y;
		  PrintWriter pw = res.getWriter();
		  res.setContentType("text/html");
		  pw.println("Sum="+z+"<br>");
		  RequestDispatcher rd = req.getRequestDispatcher("input.html");
		  rd.include(req, res);

	}
}
