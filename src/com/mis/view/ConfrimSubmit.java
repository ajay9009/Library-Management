package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mis.controller.SecurityController;
import com.mis.controller.Student_Controller;
import com.mis.model.Security;


/**
 * Servlet implementation class ConfrimSubmit
 */
@WebServlet("/ConfrimSubmit")
public class ConfrimSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfrimSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Security seq=new Security();
		HttpSession ses = request.getSession();
		
		seq.setRollno(ses.getValue("ROLL").toString());
		seq.setPassword(request.getParameter("p"));
		boolean status = SecurityController.addNewRecord(seq);
		if(status)
		{
			response.sendRedirect("SixthTwo");
	}
		else{
			out.println("<html>Failed to Create Password...");
			out.println("Please try again</html>");	
				
			}
			
			out.flush();
		

	}
}
