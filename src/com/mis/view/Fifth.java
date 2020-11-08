package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mis.generate.GenerateOtp;
import com.mis.send.Mailer;

/**
 * Servlet implementation class Fifth
 */
@WebServlet("/Fifth")
public class Fifth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fifth() {
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
		 HttpSession logses = request.getSession();
		logses.putValue("LOGPASS",logpass);	
		logses.putValue("LOGID",logid);
		String btn=request.getParameter("btn");
		if(btn.equals("Register")){
			response.sendRedirect("StudentRegisView");
		}
	
		else if(btn.equals("Log In")){
			response.sendRedirect("CheckStudent");
		}
	
	}

}