package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.mis.controller.Student_Controller;
import com.mis.generate.GenerateOtp;
import com.mis.model.Students;
import com.mis.send.Mailer;


/**
 * Servlet implementation class Student_Submit
 */
@WebServlet("/Student_Submit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)//Max Size 50 MB
public class Student_Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_Submit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Students S=new Students();
		S.setRollno(request.getParameter("uid"));
		S.setFname(request.getParameter("fname"));
		S.setLname(request.getParameter("lname"));
		S.setBranch(request.getParameter("branch"));
		S.setDateofadmission(request.getParameter("bd"));
		S.setEmail(request.getParameter("em"));
		S.setMobile(request.getParameter("mobile"));
		S.setState(request.getParameter("estate"));
		S.setCity(request.getParameter("ecity"));
		S.setAddress(request.getParameter("uadd"));
		Part P = request.getPart("epic");
		FileUpload F=new FileUpload(P,"C:/Eclipse Mars/eclipse/Library_Management/WebContent/images");
		S.setPicture(F.filename);
		boolean status = Student_Controller.addNewRecord(S);
		
		if(status)
		{
            String to=request.getParameter("em");
		    String subject="Email Varification from OLM";
			String otp=String.valueOf(GenerateOtp.sendOTP(6));
		    String msg = "Your One Time Password is "+otp;
		    Mailer.send(to, subject, msg); 
		    HttpSession ses = request.getSession();
			ses.putValue("OTPN",otp);
			String rolln=request.getParameter("uid");
			ses.putValue("ROLL",rolln);
response.sendRedirect("Confirm");
		}
		else{
		out.println("<html>Fail to Submit Employee Record...");
		out.println("Please try again</html>");	
			
		}
		out.println("</html>");
		out.flush();
		
	}



	}


