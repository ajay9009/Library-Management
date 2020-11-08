package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegisView
 */
@WebServlet("/StudentRegisView")
public class StudentRegisView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegisView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<script src='/Library_Management/asset/jquery-2.2.1.min.js'></script>");
		out.println("<script src='/Library_Management/asset/statecitylib.js'></script>");
		out.println("<script src='/Library_Management/asset/projectmisregi.js'></script>");
		out.println("<link rel='stylesheet' type='text/css' href='/Library_Management/asset/register.css'>");
		out.println("<html><head>");
	
		  out.println("<title>Registeration form</title> 	  </head> <body>  	<header class='hed'> <a href='http://localhost:88/Library_Management/LandingPage'>		<img src='/Library_Management/images/it.png' width='140' height='70'></a><h2>Online Library Management System</h2></header>  	<div class='pagewrap' style='background: url(/Library_Management/images/lib5.jpg;); background-size: cover;'> 		<div class='pagewrap-overlay'></div> 		<div class='content'> 			<header> 				<div class='header-content'> 					<h1>Register</h1> 					<h3>Step 1/2</h3> 				</div> 				<div class='slanted'></div> 			</header> 			<section style='background-image: url(34.jpg); background-size: cover;'> 					<form action='Student_Submit' method='post' enctype='multipart/form-data'> 				 	<center><table cellspacing='1%' cellpadding='1%' width='100%'> 		<tr> 			<td><i><b>Roll-No.:</b></i></td> 			<td><input type='text' id='uid' name='uid' size='35' class='text' placeholder='Roll No.' required=''></td> 		</tr> 		<tr> 			<td><i><b>First Name:</b></i></td> 			<td><input type='text' id='fname' name='fname' size='35' class='text' placeholder='First_name' required='' pattern='[a-z A-Z]+'></td> 		</tr>  		<tr> 			<td><i><b>Last Name:</b></i></td> 			<td><input type='text' id='lname' name='lname' size='35' class='text' placeholder='Last_name' required='' pattern='[a-z A-Z]+'></td> 		</tr>  		<tr> 			<td><i><b>Branch:</b></i></td> 			<td><input type='text' id='branch' name='branch' size='10' class='text' placeholder='Branch' required='' pattern='[a-z A-Z]+'></td> 		</tr>  		<tr> 			<td><i><b>Date of Admission:</b></i></td> 			<td><input type='Date' id='bd' name='bd' class='text' required=''></td> 		</tr>  		<tr> 			<td><i><b>E-mail:</b></i></td> 			<td><input type='email' name='em' id='em' placeholder='Abc@gmail.com' class='text' required=''></td> 		</tr>  		<tr> 			<td><i><b>Mobile No.:</b></i></td> 			<td><input type='text' name='mobile' id='mobile' placeholder='Mobile Number' required='' class='text' pattern='[0-9]{10,10}'></td> 		</tr>  		<tr> 			<td><i><b>State:</b></i></td> 			<td><select id='estate' name='estate' class='text'><option>-Select-</option></select></td> 		</tr>  		<tr> 			<td><i><b>City:</b></i></td> 			<td><select id='ecity' name='ecity' class='text'> 				<option>-Select-</option></select></td> 		</tr>  		<tr> 			<td><i><b>Full Address:</b></i></td> 			<td><textarea rows='3' cols='20' name='uadd' id='uadd' required=''></textarea></td> 		</tr>  		<tr> 			<td><i><b>Picture:</b></i></td> 			<td><input type='file' id='epic' name='epic' class='text' required='' placeholder='Insert Image'></td> 		</tr>  		<tr> 			<td><input type='submit' name='submit' class='text' onclick='mail();'></td> 		</tr>  	</table></center></form>  		</form> 			</section> 		</div> 	</div> 	<footer class='fot'>© 2018 ITM University Gwalior</footer>  </body></html>");
		  out.flush();

	}

	}


