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

import com.mis.controller.Student_Controller;
import com.mis.controller.TeacherController;
import com.mis.model.Students;
import com.mis.model.Teachers;

/**
 * Servlet implementation class FinalEditDeleteStudent
 */
@WebServlet("/FinalEditDeleteStudent")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)//Max Size 50 MB
public class FinalEditDeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalEditDeleteStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String eid=request.getParameter("uid");
	      String btn=request.getParameter("btn");
	      if(btn.equals("Delete"))
	      {
	    	 boolean st=Student_Controller.deleteRecord(eid);
	    	 response.sendRedirect("DisplayAllStudents");
	      }
	      else if(btn.equals("Edit"))
	      {
	    	  Students E=new Students();
	    		E.setRollno(request.getParameter("uid"));
	    		E.setFname(request.getParameter("fname"));
	    		E.setLname(request.getParameter("lname"));
	    		E.setBranch(request.getParameter("branch"));
	       		E.setEmail(request.getParameter("em"));
	    		E.setMobile(request.getParameter("mobile"));
	    		E.setState(request.getParameter("state"));
	    		E.setCity(request.getParameter("city"));
	    		E.setAddress(request.getParameter("address"));
	    		boolean st=Student_Controller.editRecord(E);
	            response.sendRedirect("DisplayAllStudents");
	    	  
	      }
	      else if(btn.equals("Update Picture"))
	      {     
	    		Part P=request.getPart("picture");
	    		FileUpload F=new FileUpload(P,"C:/Eclipse Mars/eclipse/Library_Management/WebContent/images");
	    		boolean st=Student_Controller.editPicture(eid, F.filename);
	    		 response.sendRedirect("DisplayAllStudents");
	      }

	}

}
