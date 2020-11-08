package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.TeacherController;
import com.mis.model.Teachers;


/**
 * Servlet implementation class EditDeleteDisplayByID
 */
@WebServlet("/EditDeleteDisplayByID")
public class EditDeleteDisplayByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDeleteDisplayByID() {
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
		Teachers E=TeacherController.displayByID(request.getParameter("tid")); 		
		if(E!=null)
		{
			out.println("<script src='/Library_Management/asset/jquery-2.2.1.min.js'></script>");
			
			 
			
		    out.println("<!DOCTYPE html> <html leng='en'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <meta name='viewport' content='height=device-height, initial-scale=1.0'> <head> <meta charset='utf-8'> <title>Profile Page Of OLMS</title> <link rel='stylesheet' type='text/css' href='/Library_Management/asset/newregi.css'> </head> <body> <div class='pagewrap'> <div class='pagewrap-overlay'></div> <div class='content'> <header> <div class='header-content'> <h3>Teacher Profile</h3> </div> <div class='slanted'></div> </header> <section style='background-image: url(/Library_Management/images/lib5.jpg); background-size: cover;'> <form action='FinalEditDeleteTeacher' method='post' enctype='multipart/form-data'> <center><table cellspacing='1%' cellpadding='1%' width='100%'> <tr> <td align='center' class='tc'> <img src='/Library_Management/images/"+E.getPicture()+"'> </td> <td> <center><h4>Update picture:</h4> <input type='file' name='picture' placeholder='select'><br> <input type=submit name='btn' value='Edit Picture' class='txt2'> </center> </td> </tr> <tr> <td><i><b>Teacher Id:</b></i></td> <td><input type='text' id='uid' name='uid' size='35' class='text' value="+E.getTeacherid()+" readonly></td> </tr> <tr> <td><i><b>First Name:</b></i></td> <td><input type='text' id='fname' name='fname' size='35' class='text' value="+E.getFname()+"></td> </tr> <tr> <td><i><b>Last Name:</b></i></td> <td><input type='text' id='lname' name='lname' size='35' class='text' value="+E.getLname()+"></td> </tr> <tr> <td><i><b>Department:</b></i></td> <td><input type='text' id='depart' name='depart' size='10' class='text' value="+E.getDepartment()+"></td> </tr> <tr> <td><i><b>E-mail:</b></i></td> <td><input type='email' id='em' name='em' class='text' value="+E.getEmail()+"></td> </tr> <tr> <td><i><b>Mobile No.:</b></i></td> <td><input type='text' id='mobile' name='mobile' class='text' value="+E.getMobile()+"></td> </tr> <tr> <td><input type='submit' name='btn' value='Edit' class='txt'></td> <td><input type='submit' name='btn' value='Delete' class='txt'></td> </tr> </table></center></form> </form> </section> </div> </div> </body>");
	
			
		}
		else
		{
		out.println("Record Not Found....");	
		}
		
		out.println("</html>");
		 

	}

}
