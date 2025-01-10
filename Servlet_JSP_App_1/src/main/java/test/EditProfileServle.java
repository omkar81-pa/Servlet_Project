package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServle extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		Cookie c[] = req.getCookies();
		
		if(c == null) {
			req.setAttribute("msg", "Sorry! Session Expired...<br>");
			req.getRequestDispatcher("Msg.jap").forward(req, res);
		}else {
			String fN = c[0].getValue();
			req.setAttribute("fname", fN);
			req.getRequestDispatcher("EditProfile.jsp").forward(req, res);
		}
	}
}
