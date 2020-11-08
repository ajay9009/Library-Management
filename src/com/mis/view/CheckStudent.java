package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mis.controller.SecurityController;
import com.mis.controller.Student_Controller;
import com.mis.model.Security;
import com.mis.model.Students;


/**
 * Servlet implementation class CheckStudent
 */
@WebServlet("/CheckStudent")
public class CheckStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckStudent() {
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
		HttpSession logses = request.getSession();
		String lpass = logses.getValue("LOGPASS").toString();
		String lid = logses.getValue("LOGID").toString();
		
		
		Security Slog=SecurityController.checkLogin(lid, lpass);
		if(Slog!=null)
		{
			Students stu=Student_Controller.checkLogin(lid,lpass);
			if(stu!=null){
		 HttpSession dtses=request.getSession();
		 dtses.putValue("STUID", stu.getRollno());
		 dtses.putValue("STUFNAME", stu.getFname());
		 dtses.putValue("STULNAME", stu.getLname());
		 dtses.putValue("STUDEP", stu.getBranch());
		 dtses.putValue("STUEM", stu.getEmail());
		 dtses.putValue("STUPIC", stu.getPicture());
		 dtses.putValue("LTIME", new Date());
		 response.sendRedirect("StudentHome");	
			}
			else
			{
			out.println("<b><font color='red'>Invalid Id</font></b>");	
			}
			
	}
		else
		{
		out.println("<b><font color='red'>Invalid Id/Password</font></b>");	
		}
		
		out.println("</html>");

}
}