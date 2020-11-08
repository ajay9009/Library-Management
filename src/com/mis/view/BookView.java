package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookView
 */
@WebServlet("/BookView")
public class BookView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		out.println("<html leng='en'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <meta name='viewport' content='height=device-height, initial-scale=1.0'> <head> <meta charset='utf-8'> <title>Book Entry</title> <link rel='stylesheet' type='text/css' href='/Library_Management/asset/bookregi.css'> <link href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'> </head> <body>");
		out.println("<div class='pagewrap'> <div class='pagewrap-overlay'></div> <div class='content'> <header> <div class='header-content'> <h1>Book Entry</h1> </div> <div class='slanted'></div> </header> <section style='background-image: url(/Library_Management/images/lib5.jpg); background-size: cover;'>");
		out.println(" <form action='BookSubmit'  method='post' enctype='multipart/form-data'> <center><table> <tr><td> <input type='text' id='bid' name='bid' class='text' placeholder='Book Id'> </td></tr> <tr><td> <input type='text' id='bname' name='bname' class='text' placeholder='Book Name'> </td></tr> <tr><td> <input type='text' id='bau' name='bau' class='text' placeholder='Book Auther'> </td></tr> <tr><td> <input type='text' id='bsb' name='bsb' class='text' placeholder='Book Subject'> </td></tr> <tr><td> <input type='text' id='bty' name='bty' class='text' placeholder='Book Type'> </td></tr> <tr><td> <h1><i class='fa fa-picture-o' aria-hidden='true'></i></h1> <input type='file' id='files' name='bpic' id='bpic' class='tt' title='Select Book Cover'> </td></tr> <tr><td> <h1><i class='fa fa-file-text' aria-hidden='true'></i></h1> <input type='file' id='files' name='bup' id='bup' class='tt' title='Select Book pdf , rar'> </td></tr> <tr><td> <input type='submit' name='submit' id='submit' value='Done'> </td></tr> </table></form>");
		out.println("</section> </div> </div> </body> </html>");
	}

}
