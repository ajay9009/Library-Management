package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Confirm
 */
@WebServlet("/Confirm")
public class Confirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession seso = request.getSession();
		String otpf = seso.getValue("OTPN").toString();
		out.println("<script src='/Library_Management/asset/confirm.js'></script>");
		out.println("<link rel='stylesheet' type='text/css' href='/Library_Management/asset/register2.css'>");
		out.println("<html><head><title>Registration form</title><meta charset='utf-8' content='width=device-width, initial-scale=1'></head><meta name='viewport' content='width=device-width, initial-scale=1.0'> <meta name='viewport' content='height=device-height, initial-scale=1.0'> <head> 	<meta charset='utf-8'> <body onLoad='s();'> <div class='pagewrap'> 		<div class='pagewrap-overlay'></div> 		<div class='content'> 			<header> 				<div class='header-content'> 					<h1>Register</h1> 					<h3>Step 2/2</h3> 				</div> 				<div class='slanted'></div> 			</header> 			<section style='background-image: url(/Library_Management/images/lib5.jpg); background-size: cover;'> 					<form action='ConfrimSubmit' method='post' target='mw'> 				 	<center><table cellspacing='5%' cellpadding='1%' width='100%'> 		 		<tr> 			<td><i><b>Enter OTP.:</b></i></td> 			<td><input type='text' id='otp' class='text' size='10' placeholder='Varification Code' required='' onkeyup='vr("+otpf+");' pattern='[0-9]{4,6}'></td> <td><div id=here> </div></td> 		</tr> 		<tr> 			<td><i><b>Create Password:</b></i></td> 			<td><input type='Password' id='p' name='p' class='text' size='30' placeholder='Password' required='' maxlength='30' pattern='[a-z A-Z 0-9]+'></td> 		</tr>  		<tr> 			<td><i><b>Confirm Password:</b></i></td> 			<td><input type='Password' id='cp' name='cp' class='text' size='30' placeholder='Confirm Password' required='' maxlength='30' onkeyup='pa();' pattern='[a-z A-Z 0-9]+'></td> 			<td><div id='pp'></div></td> 		</tr>  		<tr> 			<td><div class='submit'><input type='submit' name='submit'></div></td> 		</tr>  	</table></center></form> 			</section> 		</div> 	</div> </body> </html>");
	}

}
