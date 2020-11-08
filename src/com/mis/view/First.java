package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
out.println("<head>");
	out.println("<title>select for Log-in</title>");
	out.println("<link rel='stylesheet' type='text/css' href='/Library_Management/asset/select.css'>");
out.println("</head>");
out.println("<body>");
out.println("<form action='Second'>");
	out.println("<h1><font color = 'white'>WELCOME TO LIBRARY</font></h1>");
	out.println("<div class='logo'><a href='http://localhost:88/Library_Management/LandingPage'><img src='/Library_Management/images/it.png'></a>");
		out.println("</div>");
	out.println("<div class='card1'>");
		out.println("<div class='imagebx1'>");
			out.println("<img src='/Library_Management/images/log.png'>");
		out.println("</div>");
		out.println("<div class='details1'>");
			out.println("<h2><font color='#03a9f4'>LIBRARY LOG-IN</font></h2><br><br>");
			out.println("<button type='submit' value = 'admin' name='btn'><img src='/Library_Management/images/admin.png' height='150' width='150'> </button>");
			out.println("&nbsp;&nbsp;<button type='submit' value = 'teacher' name='btn'><img src='/Library_Management/images/tc.png' height='140' width='140' class='im'> </button>&nbsp;&nbsp;");
			out.println("<button type='submit' value = 'student' name='btn'><img src='/Library_Management/images/student.png' height='150' width='150'> </button><br><br><br>");
			
		out.println("</div>");
	out.println("</div>");
	out.println("<div class='card'>");
		out.println("<div class='imagebox'>");
			out.println("<img src='/Library_Management/images/know1.png' width='101%'>");
		out.println("</div>");
		out.println("<div class='details'>");
		out.println("<center><h2>You Can Also Visit Our Site's</h2></center><br><br>");
		out.println("<center><a href='http://mis.itmuniversity.ac.in/itmzone/login.php'><h3><b>MIS</b></h3></a>");
		out.println("<a href='http://lms.itmuniversity.ac.in/mod/forum/discuss.php?d=5'><h3><b>MOODLE</b></h3></a>");
		out.println("<a href='http://itmuniversity.ac.in/'><h3><b>ITM Website</b></h3></a></center>");
	out.println("</div>");
	out.println("</div>");
out.println("</form>");
out.println("</body>");
out.println("</html>");
	}

}
