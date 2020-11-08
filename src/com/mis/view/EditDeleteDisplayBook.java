package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.BookController;

import com.mis.model.Book;


/**
 * Servlet implementation class EditDeleteDisplayBook
 */
@WebServlet("/EditDeleteDisplayBook")
public class EditDeleteDisplayBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDeleteDisplayBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        out.println("<html>");
		Book E=BookController.displayByID(request.getParameter("uid"));
		if(E!=null)
		{
			
		    	    
		    	    
		    	    out.println("<head> <title>table design</title> <link rel='stylesheet' type='text/css' href='/Library_Management/asset/tablebook.css'> </head>");
		    	    
		    	    out.print("<body> <br><center><table id='customers'> <tr> <th><h2>Books List</h2></th> </tr>");
		    	    
		    	    out.print("<tr> <td><a href='/Library_Management/doc/"+E.getBookfront()+"'><img src='/Library_Management/doc/"+E.getBookfront()+"' alt='"+E.getBookname()+"'  width='250'  height='300'></a> <h3 align='center' class='nn'>Name:- <i style='color: teal;'>"+E.getBookname()+"</i></h3> <h3 align='center' id='n2'>Id Number:- <i style='color: teal;'>"+E.getBookid()+"</i></h3> <h3 align='center' id='n2'>Author Name:- <i style='color: teal;'>"+E.getAuthor()+"</i></h3> <h3 align='center' id='n2'>Subject:- <i style='color: teal;'>"+E.getSubject()+"</i></h3> <h3 align='center' id='n2'>Type:- <i style='color: teal;'>"+E.getType()+"</i></h3> <h3 align='center' id='n3'><a href='/Library_Management/doc/"+E.getUploadbook()+"' target='mw'>Open/Download</a></h3> </td> </tr>");	
	 
		    	    out.print("</table></center> </body>");
		}
		else
		{
		out.println("<br><br><center><h1>Searched Book Not Found....</h1></cener>");	
		}
		
		out.println("</html>");
		}
	}


