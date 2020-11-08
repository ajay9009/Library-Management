package com.mis.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.RequestBookController;
import com.mis.controller.Student_Controller;

/**
 * Servlet implementation class FinalDeleteBook
 */
@WebServlet("/FinalDeleteBook")
public class FinalDeleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalDeleteBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eid=request.getParameter("uid");
	      String btn=request.getParameter("btn");
	      if(btn.equals("Yes"))
	      {
	    	 boolean st=RequestBookController.deleteRecord(eid);
	    	 response.sendRedirect("CheckRequest");
	      }
	      else if(btn.equals("Cancel")){
	    	  response.sendRedirect("CheckRequest");  
	      }
	}

}
