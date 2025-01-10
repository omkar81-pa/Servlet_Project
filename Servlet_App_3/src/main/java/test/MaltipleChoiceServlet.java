package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class MaltipleChoiceServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sb = req.getParameter("sb");
		if(sb.equals("Add")) {
			RequestDispatcher rd = req.getRequestDispatcher("add");
			rd.forward(req, res);
		}else if(sb.equals("Subtract")){
			RequestDispatcher rd = req.getRequestDispatcher("sub");
			rd.forward(req, res);
		}else if(sb.equals("Multiply")){
			RequestDispatcher rd = req.getRequestDispatcher("mul");
			rd.forward(req, res);
		}else if(sb.equals("Divide")){
			RequestDispatcher rd = req.getRequestDispatcher("div");
			rd.forward(req, res);
		}else if(sb.equals("Modulo")){
			RequestDispatcher rd = req.getRequestDispatcher("mod");
			rd.forward(req, res);
		}else if(sb.equals("Average")){
			RequestDispatcher rd = req.getRequestDispatcher("avg");
			rd.forward(req, res);
		}else if(sb.equals("Greater")){
			RequestDispatcher rd = req.getRequestDispatcher("grt");
			rd.forward(req, res);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("sml");
			rd.forward(req, res);
		}
	}
}
