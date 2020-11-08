package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SixthTwo
 */
@WebServlet("/SixthTwo")
public class SixthTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SixthTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><center><form action = 'Fourth' target='mw'><h1 style='color:red;'>You Are Registered Successfully</h1><h3>Thank You For Joining Us</h3><br><img src='/Library_Management/images/ri1.png' width='100' height='100'><br><h3>Click OK to Continue</h3><br><input type='submit' name='submit' value='OK'></form></center></html>");		
	}

}
