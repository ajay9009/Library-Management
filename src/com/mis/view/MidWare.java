package com.mis.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MidWare
 */
@WebServlet("/MidWare")
public class MidWare extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MidWare() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String logid=request.getParameter("uid");
		 String logpass=request.getParameter("pass");
		 HttpSession logt = request.getSession();
		logt.putValue("LOGP",logpass);	
		logt.putValue("LOGI",logid);
		String btn=request.getParameter("btn");
		if(btn.equals("regi")){
			response.sendRedirect("sixth");
		}
		else if(btn.equals("Log In")){
			response.sendRedirect("CheckTeacherLogin");
		}
		}

}
