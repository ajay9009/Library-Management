package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminHome
 */
@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession ses=request.getSession();
		try{
			out.println("<html> <head> <meta charset='UTF-8'> <title>Admin Panel For Liberery</title> <link rel='stylesheet' type='text/css' href='/Library_Management/asset/adminnew.css'> </head>");
		out.println("<body> <div id='header'> <div class='logo'> <h3>Admin Home</h3> <h2>Name:- "+ses.getValue("ADMINNAME").toString()+"</h2> <a href='First'>Logout</a> <h4>Time:- "+ses.getValue("LTIME")+"</h4> </div>");
		out.println("<form><a class='mobile'>MENU</a> <div id='container'> <div class='sidebar'> <ul id='nav'>");
		out.println("<br><br><center><img src='/Library_Management/images/"+ses.getValue("APICTURE")+"' width='160' height='160'></center><br>");
		out.println("<center><b><h3 style='color:white;'>Id: "+ses.getValue("ADMINID")+"</h3></b></center><br>");
		out.println("<li> <span> <img src='http://www.webhostingreviewsbynerds.com/wp-content/plugins/rss-poster/cache/e17b1_fnal-570x456.png' width='32' height='32' > </span> <a class='selected' href='TeacherView' target='mw'>Add Faculty</a> </li>");
		out.println("<li> <span> <img src='http://www.webhostingreviewsbynerds.com/wp-content/plugins/rss-poster/cache/e17b1_fnal-570x456.png' width='32' height='32' > </span><a href='DisplayAllTeachers' target='mw'>Display All Faculty</a> </li>");
		out.println("<li> <span> <img src='http://www.webhostingreviewsbynerds.com/wp-content/plugins/rss-poster/cache/e17b1_fnal-570x456.png' width='32' height='32' > </span><a href='DisplayAllStudents' target='mw'>Display All Students</a> </li>");
		out.println("<li> <span> <img src='http://www.webhostingreviewsbynerds.com/wp-content/plugins/rss-poster/cache/e17b1_fnal-570x456.png' width='32' height='32' > </span><a href='SearchTeacher' target='mw'>Search Faculty</a> </li>");
		out.println("<li> <span> <img src='http://www.webhostingreviewsbynerds.com/wp-content/plugins/rss-poster/cache/e17b1_fnal-570x456.png' width='32' height='32' > </span><a href='SearchStudent' target='mw'>Search Students</a> </li> </ul> </div>");
		out.println("<div class='content'> <br><br><iframe frameborder='0' width='1090' height='570' name='mw'></iframe> </div>");
		out.println("</div> <!-- #container --> <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script> <script> $(document).ready(function(){$('a.mobile').click(function(){$('.sidebar').slideToggle('fast'); }); window.resize = function(event){if($(window).width() > 320){$('.sidebar').show(); } }; }); </script> </form></body> </html>");
		}catch(Exception e)
		{
			response.sendRedirect("AdminLogin");
		}
	}

}




