package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/log")
public class WelcomeServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		ServletConfig scf = this.getServletConfig();
		String servletName = scf.getServletName();
		req.setAttribute("servletName", servletName);
		req.getRequestDispatcher("Welcome.jsp").forward(req, res);
	}
}
