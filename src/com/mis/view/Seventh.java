package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Seventh
 */
@WebServlet("/Seventh")
public class Seventh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Seventh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
    	
    	out.println("<html leng='en'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <head> <meta charset='utf-8'> <title>Forget Password</title> <link rel='stylesheet' type='text/css' href='/Library_Management/asset/forget.css'> </head> <body> <div class='pagewrap'> <div class='pagewrap-overlay'></div> <div class='content'> <header> <div class='header-content'> <h1>Forget Password</h1> </div> <div class='slanted'></div> </header> <section style='background-image: url(image/34.jpg); background-size: cover;'> <form action='SearchforPassword'> <center><table cellspacing='5%' cellpadding='1%' width='100%'>");
    	
    	out.println("<tr> <td><i><b class='tt'>Roll Number</b></i></td> <td><input type='text' id='eid' name='eid' class='text' size='10'  required=''></td> </tr>");
    	
    	out.println("<tr> <td><div class='submit'><input type='submit' name='submit' value='Search'></div></td> </tr>");
    	
    	out.println("</table></center></form> </section> </div> </div> </body> </html>");
    	
    	out.flush();
	}

}
