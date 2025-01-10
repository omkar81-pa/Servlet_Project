package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet 
{
	@Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,
  IOException
  {
	  String uN = req.getParameter("uname");
	  String pW = req.getParameter("pword");
	  UserBean ub = new LoginDAO().login(uN,pW);
	  if(ub==null) {
		  req.setAttribute("msg","Invalid Login process...<br>");
		  req.getRequestDispatcher("Msg.jsp").forward(req, res);
	  }else {
		Cookie ck = new Cookie("fname",ub.getfName()); 
		ServletContext sct = req.getServletContext();
		           //Accessing SrvletContext Object reference
		sct.setAttribute("ubean", ub);
		res.addCookie(ck);//Adding Cookie is response
		req.getRequestDispatcher("LogSuccess.jsp").forward(req, res);
	  }
  }
}
