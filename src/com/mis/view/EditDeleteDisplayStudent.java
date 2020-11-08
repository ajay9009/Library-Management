package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.Student_Controller;
import com.mis.model.Students;

/**
 * Servlet implementation class EditDeleteDisplayStudent
 */
@WebServlet("/EditDeleteDisplayStudent")
public class EditDeleteDisplayStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDeleteDisplayStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        out.println("<html> <head><link rel='stylesheet' type='text/css' href='/Library_Management/asset/studis.css'></head>");
		Students E=Student_Controller.displayByID(request.getParameter("uid")); 		
		if(E!=null)
		{
			out.println("<script src='/Library_Management/asset/jquery-2.2.1.min.js'></script>");
			
			 
			out.println("<section><form action='FinalEditDeleteStudent' method='post' enctype='multipart/form-data'>");
            out.println("<table><tr><td>");
			out.println("<table>");
		    out.println("<caption><b><i><h1>Student Profile</h1></i></b></caption>");
		    
		    out.println("<tr><td><b><i>Roll No.:</i></b></td>");
		    out.println("<td><input type='text' class='text' name='uid' value='"+E.getRollno()+"' readonly></td></tr>");
		    
		    
		    out.println("<tr><td><b><i>First_Name:</i></b></td>");
		    out.println("<td><input type='text' class='text' name='fname' value='"+E.getFname()+"'></td></tr>");
		    
		    out.println("<tr><td><b><i>Last_Name:</i></b></td>");
		    out.println("<td><input type='text' class='text' name='lname' value='"+E.getLname()+"'></td></tr>");
		    
		   
		    out.println("<tr><td><b><i>Branch:</i></b></td>");
		    out.println("<td><input type='text' class='text' name='branch' value='"+E.getBranch()+"'></td></tr>");
		   
		   
		    out.println("<tr><td><b><i>Email:</i></b></td>");
		    out.println("<td><input type='email' class='text' name='em' value='"+E.getEmail()+"'></td></tr>");
		    
		    out.println("<tr><td><b><i>State:</i></b></td>");
		    out.println("<td><input type='text' class='text' name='state' value='"+E.getState()+"'></td></tr>");
		    
		    out.println("<tr><td><b><i>City:</i></b></td>");
		    out.println("<td><input type='text' class='text' name='city' value='"+E.getCity()+"'></td></tr>");
		    
		    out.println("<tr><td><b><i>Address:</i></b></td>");
		    out.println("<td><input type='text' class='text' name='address' value='"+E.getAddress()+"'></td></tr>");
		   
		    out.println("<tr><td><b><i>Mobile:</i></b></td>");
		    out.println("<td><input type='text' class='text' name='mobile' value='"+E.getMobile()+"'></td></tr>");
		   
		    
		    out.println("</table></td>");
		    out.println("<td valign=top class='tc'><img src='/Library_Management/images/"+E.getPicture()+"' width=400 height=500><br><br><i class='ud'>Update Picture:</i><br><input type=file name='picture'><br><br><input type=submit name='btn' value='Update Picture' class='txt2'></td></table>");
		    out.println("<input type='submit' class='txt' value='Edit' name='btn'><br>  <input type='Submit' value='Delete' class='txt' name='btn'></form></section>");
		    
	
			
		}
		else
		{
		out.println("Record Not Found....");	
		}
		
		out.println("</html>");
		 

	}

	}

