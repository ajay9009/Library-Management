package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.TeacherController;


/**
 * Servlet implementation class DisplayAllTeachers
 */
@WebServlet("/DisplayAllTeachers")
public class DisplayAllTeachers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllTeachers() {
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
	    ResultSet rs=TeacherController.displayAll();
	    if(rs.next())
	    { out.println("<center><table id='customers'>");
	    out.println("<caption><b><i><h2>List of Teachers</h2></i></b></caption>");
	    
	    	    out.println("<tr><th>Teacher</th><th>TeacherID</th><th>Email-Id</th><th>Mobile-No.</th><th>Department</th><th>Update</th></tr>");
	    do{
	    out.println("<tr><td><center>"+rs.getString(2)+" "+rs.getString(3)+"<br><img src='/Library_Management/images/"+rs.getString(7)+"' width=80 height=60></center></td><td><center>"+rs.getString(1)+"</center></td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td><center>"+rs.getString(4)+"</center></td><td><a href=EditDeleteDisplayByID?tid="+rs.getString(1)+">Edit/Delete</a></td></tr>");	
	    	
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
