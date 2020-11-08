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


import com.mis.controller.TeacherController;
import com.mis.generate.GenerateOtp;
import com.mis.model.Teachers;
import com.mis.send.Mailer;

/**
 * Servlet implementation class TeacherSubmit
 */
@WebServlet("/TeacherSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)//Max Size 50 MB
public class TeacherSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Teachers S=new Teachers();
		S.setTeacherid(request.getParameter("uid"));
		S.setFname(request.getParameter("fname"));
		S.setLname(request.getParameter("lname"));
		S.setDepartment(request.getParameter("depart"));
		S.setEmail(request.getParameter("em"));
		S.setMobile(request.getParameter("mobile"));
		Part P = request.getPart("im");
		FileUpload F=new FileUpload(P,"C:/Eclipse Mars/eclipse/Library_Management/WebContent/images");
		S.setPicture(F.filename);
		boolean status = TeacherController.addNewRecord(S);
		
		if(status)
		{
            String to=request.getParameter("em");
		    String subject="Email Varification from OLM";
			String otp=String.valueOf(GenerateOtp.sendOTP(6));
		    String msg = "Your One Time Password is "+otp;
		    Mailer.send(to, subject, msg); 
		    HttpSession seso = request.getSession();
			seso.putValue("OTPN",otp);
			String rolln=request.getParameter("uid");
			seso.putValue("ROLL",rolln);
response.sendRedirect("Confirm");
		}
		else{
		out.println("<html>Fail to Submit Teacher's Record...");
		out.println("Please try again</html>");	
			
		}
		out.println("</html>");
		out.flush();

	}

}
