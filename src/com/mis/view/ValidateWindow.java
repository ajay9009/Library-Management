package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mis.controller.SecurityController;
import com.mis.controller.Student_Controller;
import com.mis.model.Security;
import com.mis.model.Students;

/**
 * Servlet implementation class ValidateWindow
 */
@WebServlet("/ValidateWindow")
public class ValidateWindow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateWindow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession sesion = request.getSession();
		String rcd = sesion.getValue("RCD").toString();
		String rvid = sesion.getValue("RECID").toString();
        out.println("<html>");
		 Security Seq=SecurityController.show(rvid); 		
		if(Seq!=null)
		{
			String pass = Seq.getPassword();		
		out.println("<script src='/Library_Management/asset/jquery-2.2.1.min.js'></script>");
			out.println("<script src='/Library_Management/asset/validate.js'></script><html><head><title>itm-university/mis/log_in/</title><meta name='viewport' content='width=device-width, initial-scale=1'><style>#myDIV {width: 100%;padding: 50px 0;text-align: center;background-color: lightblue;margin-top: 20px;}</style><script>$(document).ready(function(){$('p').hide();$('#myBtn').click(function(){$('p').show();});});</script></head>");
		out.println("<body onLoad='s();'><center><h1>Password Window</h1><form>");
	out.println("<caption><h2>Fill Correct OTP Which is sended to your registered email address to Check Password</h2><br><br></caption><i><b>Enter OTP.:</b></i><input type='text' id='otp' size='10' placeholder='Recovery Code' required='' onkeyup='vr("+rcd+");' pattern='[0-9]{4,6}'><div id=here></div></form><br><button id='myBtn' onclick='myFunction();'>Check Password</button><div id='myDIV'>Roll No: "+rvid+"<br>Password: "+pass+"</div><br><a href=Fourth>Click OK to Continue</a></center></body></html>");
	}
		else
		{
			out.println("<script>alert('This roll no. is not registered yet');</script>");
		}
	}
}
