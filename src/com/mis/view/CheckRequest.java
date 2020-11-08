package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.RequestBookController;


/**
 * Servlet implementation class CheckRequest
 */
@WebServlet("/CheckRequest")
public class CheckRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	    try{
	    	out.println("<html>");
	    	out.println("<head><title>table design</title>");
	    	out.println("<link rel='stylesheet' type='text/css' href='/Library_Management/asset/teachertable.css'>");
	    ResultSet rs=RequestBookController.displayAll();
	    if(rs.next())
	    { out.println("<center><table id='customers'>");
	    out.println("<caption><b><i><h2>List of Requested Books</h2></i></b></caption>");
	    
	    out.println("<tr><th>S.no</th><th>Book</th><th>Delete</th></tr>");
	    int i= 1;
	    do{
	    	
	    out.println("<tr><td>"+i+"</td><td>"+rs.getString(1)+"<td><a href=DeleteRequest?uid="+rs.getString(1)+">Remove</a></td></tr>");	
	    i++;
	    }while(rs.next());
	    out.println("</table></center>"); 	
	    	
	    }
	    else
	    {out.println("<h1>Record Not Found...</h1>");}
	    	
	    }catch(Exception e){
	    System.out.println(e);	
	    	
	    }
	    out.println("</html>");

	}

}
