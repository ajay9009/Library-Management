package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mis.controller.Student_Controller;
import com.mis.generate.GenerateOtp;
import com.mis.model.Students;
import com.mis.send.Mailer;


/**
 * Servlet implementation class SearchforPassword
 */
@WebServlet("/SearchforPassword")
public class SearchforPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchforPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        out.println("<html>");
		 Students S=Student_Controller.show(request.getParameter("eid")); 		
		if(S!=null)
		{	
			
			String email = S.getEmail();
			String rvid = S.getRollno();
			String subject="Password Recovery from OLM";
			String cd=String.valueOf(GenerateOtp.sendOTP(6));
		    String msg = "Your Varification code is "+cd;
		    Mailer.send(email, subject, msg); 
		    HttpSession sesion = request.getSession();
			sesion.putValue("RCD",cd);
			sesion.putValue("RECID",rvid);
			response.sendRedirect("ValidateWindow");
		}
		else
		{
			out.println("<script>alert('This roll no. is not registered yet');</script>");
			
		}
		
		
out.println("</html");
out.flush();
	}
}
