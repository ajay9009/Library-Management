package com.mis.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.mis.controller.TeacherController;
import com.mis.model.Teachers;

/**
 * Servlet implementation class FinalEditDeleteTeaacher
 */
@WebServlet("/FinalEditDeleteTeacher")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)//Max Size 50 MB
public class FinalEditDeleteTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalEditDeleteTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String uid=request.getParameter("uid");
	      String btn=request.getParameter("btn");
	      if(btn.equals("Delete"))
	      {
	    	 boolean st=TeacherController.deleteRecord(uid);
	    	 response.sendRedirect("DisplayAllTeachers");
	      }
	      else if(btn.equals("Edit"))
	      {
	    	  Teachers E=new Teachers();
	    		E.setTeacherid(request.getParameter("uid"));
	    		E.setFname(request.getParameter("fname"));
	    		E.setLname(request.getParameter("lname"));
	    		
	    		E.setDepartment(request.getParameter("depart"));
	       		E.setEmail(request.getParameter("em"));
	    		E.setMobile(request.getParameter("mobile"));
	    		boolean st=TeacherController.editRecord(E);
	            response.sendRedirect("DisplayAllTeachers");
	    	  
	      }
	      else if(btn.equals("Edit Picture"))
	      {     
	    		Part P=request.getPart("picture");
	    		FileUpload F=new FileUpload(P,"C:/Eclipse Mars/eclipse/Library_Management/WebContent/images");
	    		boolean st=TeacherController.editPicture(uid, F.filename);
	    		 response.sendRedirect("DisplayAllTeachers");
	      }
		
	}

}
