package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/UserRegistrationServlet")
@SuppressWarnings("serial")
public class DesplayServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
			String username = req.getParameter("username");
	        String password = req.getParameter("password");
	        String firstname = req.getParameter("firstname");
	        String lastname = req.getParameter("lastname");
	        String city = req.getParameter("city");
	        String mailId = req.getParameter("mailid");
	        String phone = req.getParameter("phone");

	        // Set data as request attributes
	        req.setAttribute("username", username);
	        req.setAttribute("firstname", firstname);
	        req.setAttribute("lastname", lastname);
	        req.setAttribute("city", city);
	        req.setAttribute("mailId", mailId);
	        req.setAttribute("phone", phone);
		
		RequestDispatcher rd = req.getRequestDispatcher("output.jsp");
		rd.forward(req, res);
	}

}
