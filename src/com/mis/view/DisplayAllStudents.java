package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.Student_Controller;

/**
 * Servlet implementation class DisplayAllStudents
 */
@WebServlet("/DisplayAllStudents")
public class DisplayAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllStudents() {
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
	    ResultSet rs=Student_Controller.displayAll();
	    if(rs.next())
	    { out.println("<center><table id='customers'>");
	    out.println("<caption><b><i><h2>List of Student's</h2></i></b></caption>");
	    
	    out.println("<tr><th>Student</th><th>Roll-No.</th><th>Email-Id</th><th>Mobile-No.</th><th>Branch</th><th>Address</th><th>D.O.A</th><th>Update</th></tr>");
	    do{
	    out.println("<tr><td>"+rs.getString(2)+" "+rs.getString(3)+"<br><img src='/Library_Management/images/"+rs.getString(10)+"' width='70' height='60'><br></td><td>"+rs.getString(1)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(11)+","+rs.getString(12)+"</td><td>"+rs.getString(5)+"</td><td><a href=EditDeleteDisplayStudent?uid="+rs.getString(1)+">Edit/Remove</a></td></tr>");	
	   
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
