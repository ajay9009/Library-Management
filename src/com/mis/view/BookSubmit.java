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

import com.mis.controller.BookController;
import com.mis.model.Book;


/**
 * Servlet implementation class BookSubmit
 */
@WebServlet("/BookSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)//Max Size 50 MB
public class BookSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		Book S=new Book();
		S.setBookid(request.getParameter("bid"));
		S.setBookname(request.getParameter("bname"));
		S.setAuthor(request.getParameter("bau"));
		S.setSubject(request.getParameter("bsb"));
		S.setType(request.getParameter("bty"));
		Part P=request.getPart("bpic");
		FileUpload F=new FileUpload(P,"C:/Eclipse Mars/eclipse/Library_Management/WebContent/doc");
		S.setBookfront(F.filename);
		Part B = request.getPart("bup");
		FileUpload F1=new FileUpload(B,"C:/Eclipse Mars/eclipse/Library_Management/WebContent/doc");
		S.setUploadbook(F1.filename);
		boolean status = BookController.addNewRecord(S);
		
		if(status)
		{
           out.println("<html><h1>Book Added Successfully");
			
		}
		else{
		out.println("<html>Fail to Submit Book Record...");
		out.println("Please try again</html>");	
			
		}
		out.println("</html>");
		out.flush();
		
	}

	}

