package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mis.controller.BookController;

/**
 * Servlet implementation class EditDeleteDisplayBookBySub
 */
@WebServlet("/EditDeleteDisplayBookBySub")
public class EditDeleteDisplayBookBySub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDeleteDisplayBookBySub() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();	
			try{
				
				 out.println("<html>");
			    ResultSet rs=BookController.displayAllBySub(request.getParameter("us"));
			    if(rs.next())
			    { out.println("<head> <title>table design</title> <link rel='stylesheet' type='text/css' href='/Library_Management/asset/tablebook.css'> </head>");
			    
			    out.print("<body> <br><center><table id='customers'> <tr> <th><h2>Books List</h2></th> </tr>");
			    do{
			    out.print("<tr> <td><a href='/Library_Management/doc/"+rs.getString(7)+"'><img src='/Library_Management/doc/"+rs.getString(6)+"' alt='"+rs.getString(2)+"'  width='250'  height='300'></a> <h3 align='center' class='nn'>Name:- <i style='color: teal;'>"+rs.getString(2)+"</i></h3> <h3 align='center' id='n2'>Id Number:- <i style='color: teal;'>"+rs.getString(1)+"</i></h3> <h3 align='center' id='n2'>Author Name:- <i style='color: teal;'>"+rs.getString(3)+"</i></h3> <h3 align='center' id='n2'>Subject:- <i style='color: teal;'>"+rs.getString(4)+"</i></h3> <h3 align='center' id='n2'>Type:- <i style='color: teal;'>"+rs.getString(5)+"</i></h3> <h3 align='center' id='n3'><a href='/Library_Management/doc/"+rs.getString(7)+"' target='mw'>Open/Download</a></h3> </td> </tr>");	
			    }while(rs.next());
			    out.print("</table></center> </body>");
			    	
			    }
			    else
			    {out.println("<h1>Record Not Found...</h1>");}
			    	
			    }catch(Exception e){
			    System.out.println(e);	
			    	
			    }
			    out.println("</html>");

	}

}
