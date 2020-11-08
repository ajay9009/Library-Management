package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.RequestBookController;
import com.mis.controller.Student_Controller;
import com.mis.model.RequestBook;
import com.mis.model.Students;

/**
 * Servlet implementation class DeleteRequest
 */
@WebServlet("/DeleteRequest")
public class DeleteRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        out.println("<html><center>");
        RequestBook E=RequestBookController.displayUnique(request.getParameter("uid"));
        if(E!=null)
		{
			out.println("<script src='/Library_Management/asset/jquery-2.2.1.min.js'></script>");
			
        out.println("<form action ='FinalDeleteBook' method='post'>");
        out.println("<h1>Confirmation</h1>");
        out.println("Delete this Request<input type='text' name='uid' value='"+E.getBook()+"' readonly>");
        out.println("<input type='submit' value='Yes' name='btn'><input type='Submit' value='Cancel' name='btn'></form></center><html>");
		
		}
	}

}
