package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fourth
 */
@WebServlet("/Fourth")
public class Fourth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fourth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Student Login For Library</title>");
		out.println("<link rel='stylesheet' type='text/css' href='/Library_Management/asset/projectmis.css'>");
		out.println("<link rel='stylesheet' type='text/css' href='/Library_Management/asset/projecmis1.css'>");
	
		out.println("</head><body>");
		out.println("<div class='log'><a href='http://localhost:88/Library_Management/LandingPage'><img src='/Library_Management/images/ITMUniv.png' width='10%' height='10%'></a><h1>WELCOME TO LIBRARY</h1></div>");
		out.println("<div class='simg'><p></p></div><div class='log2'></div><div class='con'><div class='left'></div><div class='right'><div class='formbox'><form action='Fifth'><div class='table'>");
		out.println("<table><tr><center><p>Student</p></center></tr><tr><td><i><b>User-id:</b></i></td>");
		out.println("<td><input type='text' name='uid' size='35' placeholder='Roll Number' pattern='[a-z A-Z 0-9]+'></td>");
		out.println("</tr><tr><td><i><b>Password: </b></i></td>");
		out.println("<td><input type='password' name='pass' placeholder='Password'></td>");
		out.println("</tr><div class='bu'><tr><td><input type='submit' name='btn' value='Log In'></td></tr>");
			out.println("</table></div><br><br><div class='forbutt'><a href='Seventh'>Forget Password</a></div><br><div class='regi'><input type='submit' value = 'Register' name='btn'></div></div></div></form></body></html>");

	}

}
