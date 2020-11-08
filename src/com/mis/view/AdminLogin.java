package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	    out.println("<html> <head> 	<title>Admin login for OLMS</title> 	<link rel='stylesheet' type='text/css' href='/Library_Management/asset/log-in.css'> 	<link href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'> </head> <body>  	<header class='hed'> 	<a href='http://localhost:88/Library_Management/LandingPage'>	<img src='/Library_Management/images/it.png' width='140' height='70'></a><h1>Online Library Management System</h1></header>  	<div class='form'> 		<form action='CheckAdminLogin' method='post'> 			<center><h2>Admin Log-In</h2></center> 			<div class='inputbox'> 				<i class='fa fa-user' aria-hidden='true'></i> 				<input type='text' name='id' placeholder='Username' required=''> 			</div> 			<div class='inputbox'> 				<i class='fa fa-unlock-alt' aria-hidden='true'></i> 				<input type='password' name='password' placeholder='Password' required=' '> 			</div> 			<div class='inputbox'> 				<input type='submit' name='submit' value='Log In'> 			</div>  		</form> 	</div>  	<footer class='fot'>© 2018 ITM University Gwalior</footer>  </body> </html>");
	    out.flush();
	}

}
