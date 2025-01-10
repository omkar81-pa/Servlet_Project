package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebFilter("/log")
public class LoginFilter implements Filter
{
	public String filterName = null;
	@Override
	public void init(FilterConfig fcf) throws ServletException 
	{
		filterName = fcf.getFilterName();
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException 
	{
		String logName = req.getParameter("logname");
		if(logName.equals("nithyd")) {
			req.setAttribute("filterName", filterName);
			chain.doFilter(req, res);
		}else {
			req.setAttribute("msg", "Invailid login process...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
	}
	@Override
	public void destroy() 
	{
		
	}
}
