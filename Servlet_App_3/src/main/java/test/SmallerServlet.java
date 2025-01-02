package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/sml")
public class SmallerServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		int x = Integer.parseInt(req.getParameter("v1"));
		int y = Integer.parseInt(req.getParameter("v2"));
		int min = (x < y) ? x : y;
		PrintWriter pw = res.getWriter();
		
		pw.println("Sml = "+min+"<br>");
		RequestDispatcher rd = req.getRequestDispatcher("input.html");
		rd.include(req, res);
	}
}
