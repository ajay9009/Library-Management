package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mis.controller.RequestBookController;

import com.mis.model.RequestBook;

/**
 * Servlet implementation class RequestBookSubmit
 */
@WebServlet("/RequestBookSubmit")
public class RequestBookSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestBookSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		RequestBook S=new RequestBook();
		S.setBook(request.getParameter("bk"));
		boolean status = RequestBookController.addNewRecord(S);
		if(status)
		{
           out.println("<html><br><br><center><h1 style='color:blue;'>Request Submitted Successfully</h1></center>");
			
		}
		else{
		out.println("<html><br><br><center><h1 style='color:red;'>This Request Is Already In-Queue...");
		out.println("Please try again</h1></center></html>");	
			
		}
		out.println("</html>");
		out.flush();

	}

}
