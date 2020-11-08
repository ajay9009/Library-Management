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
import com.mis.controller.TeacherController;
import com.mis.model.Security;
import com.mis.model.Teachers;

/**
 * Servlet implementation class CheckTeacherLogin
 */
@WebServlet("/CheckTeacherLogin")
public class CheckTeacherLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckTeacherLogin() {
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
		HttpSession logt = request.getSession();
		String lpass = logt.getValue("LOGP").toString();
		String lid = logt.getValue("LOGI").toString();		
		
		Security Sl=SecurityController.checkLogin(lid, lpass);
		if(Sl!=null)
		{
			Teachers tch=TeacherController.checkLogin(lid,lpass);
			if(tch!=null){
		 HttpSession tcses=request.getSession();
		 tcses.putValue("TEACHERID", tch.getTeacherid());
		 tcses.putValue("TEACHERFNAME", tch.getFname());
		 tcses.putValue("TEACHERLNAME", tch.getLname());
		 tcses.putValue("TPICTURE", tch.getPicture());
		 tcses.putValue("LTIME", new Date());
		 response.sendRedirect("TeacherHome");	
			}
			else
			{
			out.println("<center><b><font color='red'>Invalid Id</font></b></center>");	
			}
			
	}
		else
		{
		out.println("<center><b><font color='red'>Invalid Id/Password</font></b></center>");	
		}
		
		out.println("</html>");

	}

}
