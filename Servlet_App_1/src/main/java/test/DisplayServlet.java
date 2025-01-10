package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")
public class DisplayServlet implements Servlet
{
	public ServletConfig scf = null; 
	public void init(ServletConfig scf) throws ServletException
    {
	   this.scf=scf;
    }
	public void service(ServletRequest req,ServletResponse res) throws 
			    ServletException,IOException
	{
		String eId = req.getParameter("eid");
		String eName = req.getParameter("ename");
		String eDesg = req.getParameter("edesg");
		ServletContext sct = req.getServletContext();
		PrintWriter pw = res.getWriter();
	    res.setContentType("text/html");
	    pw.println("=======EmployeeDetails======");
	    pw.println("<br>Emp-Id:"+eId);
	    pw.println("<br>Emp-Name:"+eName);
	    pw.println("<br>Emp-Desg:"+eDesg);
	    pw.println("<br>=========ServletContext==========");
	    pw.println("<br>Server-Info:"+sct.getServerInfo());
	    pw.println("<br>=========ServletConfig=========");
	    pw.println("<br>Servlet-name:"+scf.getServletName());
	}
	public void destroy()
	{
		//NoCode
	}
	 public String getServletInfo()
	 {
		 return "Servlet displaying Employee details";
	 }
	 public ServletConfig getServletConfig()
	 {
		 return this.getServletConfig();
	 }
	 
}
