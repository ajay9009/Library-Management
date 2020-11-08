package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeacherView
 */
@WebServlet("/TeacherView")
public class TeacherView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		out.println("<script src='/Library_Management/asset/confirm.js'></script><script src='/Library_Management/asset/teacherregi.js'></script><!DOCTYPE html> <html leng='en'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <meta name='viewport' content='height=device-height, initial-scale=1.0'> <head>  	<meta charset='utf-8'> 	<title>Registeration for OLMS</title> 	<link rel='stylesheet' type='text/css' href='/Library_Management/asset/facultyregi.css'>  </head> <body><div class='pagewrap'> 		<div class='pagewrap-overlay'></div> 		<div class='content'> 			<header> 				<div class='header-content'> 					<h1>Faculty Register</h1> 					<h3>Step 1/2</h3> 				</div> 				<div class='slanted'></div> 			</header> 			<section style='background-image: url(/Library_Management/images/lib5.jpg); background-size: cover;'> 					<form action='TeacherSubmit' method='post' enctype='multipart/form-data' onkeyup='Confirm'> 				 	<center><table cellspacing='1%' cellpadding='1%' width='100%'> 		<tr> 			<td><i><b>Faculty Id:</b></i></td> 			<td><input type='text' id='uid' name='uid' size='35' class='text' placeholder='College Id' required=''></td> 		</tr> 		<tr> 			<td><i><b>First Name:</b></i></td> 			<td><input type='text' id='fname' name='fname' size='35' class='text' placeholder='First_name' required='' pattern='[a-z A-Z]+'></td> 		</tr>  		<tr> 			<td><i><b>Last Name:</b></i></td> 			<td><input type='text' id='lname' name='lname' size='35' class='text' placeholder='Last_name' required='' pattern='[a-z A-Z]+'></td> 		</tr>  		<tr> 			<td><i><b>Department:</b></i></td> 			<td><input type='text' id='depart' name='depart' size='10' class='text' placeholder='Department' required='' pattern='[a-z A-Z]+'></td> 		</tr>  		<tr> 			<td><i><b>E-mail:</b></i></td> 			<td><input type='email' id='em' name='em' placeholder='Abc@gmail.com' class='text' required=''></td> 		</tr>  		<tr> 			<td><i><b>Mobile No.:</b></i></td> 			<td><input type='text' id='mobile' name='mobile' placeholder='Mobile Number' required='' class='text' pattern='[0-9]{10,10}'></td> 		</tr>	<tr> 			<td><i><b>Picture:</b></i></td> 			<td><input type='file' id='im' name='im' class='text' required='' placeholder='Insert Image'></td> 		</tr>  		<tr> 			<td><input type='submit' name='submit' class='text' onclick='mail();'></td> 		</tr>  	</table></center></form>  		</form> 			</section> 		</div> 	</div></body> </html>");
	}

}
