package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestBookView
 */
@WebServlet("/RequestBookView")
public class RequestBookView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestBookView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
    	out.println(" <html leng='en'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <head> <meta charset='utf-8'> <title>RequestWindow</title> <link rel='stylesheet' type='text/css' href='/Library_Management/asset/search.css'> </head> <body> <div class='pagewrap'> <div class='pagewrap-overlay'></div> <div class='content'> <header> <div class='header-content'> <h1>Request Window</h1> </div> <div class='slanted'></div> </header> <section style='background-image: url(/Library_Management/images/34.jpg); background-size: cover;'> <form action='RequestBookSubmit' method='post'> <center><table cellspacing='5%' cellpadding='1%' width='100%'> <tr> <td><i><b class='tt'>Book </b></i></td> <td><input type='text' id='bk' name='bk' class='text' size='10' placeholder='****' required=''></td> </tr> <tr> <td><div class='submit'><input type='submit' name='submit'></div></td> </tr> </table></center></form> </section> </div> </div> </body> </html>");
    	
    	out.flush();

	}

}
