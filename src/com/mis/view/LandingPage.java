package com.mis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LandingPage
 */
@WebServlet("/LandingPage")
public class LandingPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LandingPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html> <html> <head> <title>landing page for OLMS</title> <meta name='viewport' content='width=device-width, initial-scale=1'> <link rel='stylesheet' type='text/css' href='/Library_Management/asset/bootstrap.css'> <script src='js/jquery-3.3.1.min.js'></script> <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'> <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'> <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script> <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script> <script> </script> </head> ");
		out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.5.0/css/all.css'> <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script><link rel='stylesheet' type='text/css' href='/Library_Management/asset/bootslider.css'>");
		out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'> <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script> <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
		out.println("<link rel='stylesheet' type='text/css' href='/Library_Management/asset/meetour.css'> <meta name='viewport' content='width=device-width, initial-scale=1'> <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.5.0/css/all.css'>");
		out.println("<link rel='stylesheet' type='text/css' href='/Library_Management/asset/contactusboot.css'> <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.5.0/css/all.css'>");
		out.println("<script> $(document).ready(function(){$(window).scroll(function(){if($(this).scrollTop() > 40){$('#topbtn').fadeIn(); } else{$('#topbtn').fadeOut(); } }); $('#topbtn').click(function(){$('html ,body').animate({scrollTop : 0},800); }); }); </script>");
		
		out.println("<body> <nav class='navbar navbar-inverse navbar-fixed-top'> <div class='container'> <div class='navbar-header'> <button type='button' class='navbar-toggle' data-toggle='collapse' data-target='#navi'> <span class='icon-bar'></span> <span class='icon-bar'></span> <span class='icon-bar'></span> </button> <img src='/Library_Management/images/it2.png' class='logo' width='20%' height='20%'> </div> <div class='collapse navbar-collapse' id='navi'> <ul class='nav navbar-nav navbar-right'> <li><a href=''>Home</a></li> <li><a href=''>About Us</a></li> <li><a href=''>Contact</a></li> <li><a href='StudentRegisView' class='work'>Signup</a></li> <li><a href='http://mis.itmuniversity.ac.in/itmzone/login.php' class='work'>MIS</a></li> <li><a href='http://lms.itmuniversity.ac.in/login/index.php' class='work'>Moodle</a></li></ul> </div> </div> </nav> <section id='home' class='header-home'> <div class='container'> <div class='row'> <div class='col-sm-7 col-header-text lr-padding'> <h1>A <span>great </span>Place for Reading for your</h1> <p><i><b color='orange'>ONLINE LIBRARY MANAGEMENT SYSTEM</b></i> provindig hundred's of books pdf and download service here you can read and save your favorite book Free. </p> <a href='First' class='banner_btn btn_white'>Get Start Now</a> <a href='http://itmuniversity.ac.in/' class='banner_btn btn_trans'>ITM University Website</a> </div> <div class='col-sm-5 col-md-offset-2 colo-md-3 col-header-img right-padding'> <img src='/Library_Management/images/book3.png' class='img-header-lg' alt='' width='100%' height='100%'> </div> </div>  </div> </section>");
		
		out.println("<center><div class='books'>Our some Books</div></center> <section> <div class='slider'> </div> <center><p class='ll'><a href='Fourth'>Click To View More Books</a></p></center> </section>");
		out.println("<button id='topbtn'><i class='fas fa-arrow-up'></i></button>");
		out.println("<div class='team-section'> <div class='inner-width'> <h1>Meet Our Team</h1> <div class='pers'> <div class='pe'> <img src='/Library_Management/images/niti.jpg' alt=''> <div class='p-name'>Niyati Saxena</div> <div class='p-des'>Back-End Programmer</div> <div class='p-sm'> <a href='https://www.facebook.com/niyati.saxena.52?jazoest=2651001216611211356105111881137012010497898350538987671216579118998911554551077450697478978410611478511069081586510012211910211677565177561188011110980728072548310145817588751051146552451097857104657298761068811699119119'><i class='fab fa-facebook-f'></i></a> <a href='https://plus.google.com/u/0/112863114687101064481'><i class='fab fa-google'></i></a> <a href='#'><i class='fab fa-instagram'></i></a> </div> </div> <div class='pe'> <img src='/Library_Management/images/ajj.jpg' alt=''> <div class='p-name'>Ajay Singh</div> <div class='p-des'>Front-End Designer</div> <div class='p-sm'> <a href='https://www.facebook.com/profile.php?id=100006093070940'><i class='fab fa-facebook-f'></i></a> <a href='https://plus.google.com/u/0/discover'><i class='fab fa-google'></i></a> <a href='#'><i class='fab fa-instagram'></i></a> </div> </div> <div class='pe'> <img src='/Library_Management/images/lavi.jpeg' alt=''> <div class='p-name'>Lavish Modi</div> <div class='p-des'>Database Handler</div> <div class='p-sm'> <a href='https://www.facebook.com/lavish.modi.3?jazoest=2651001216611211356105111881137012010497898350538987671216579118998911554551077450697478978410611478511069081586510012211910211677565177561188011110980728072548310145817588751051146552451097857104657298761068811699119119'><i class='fab fa-facebook-f'></i></a> <a href='https://plus.google.com/u/0/111904732501466878613'><i class='fab fa-google'></i></a> <a href='#'><i class='fab fa-instagram'></i></a> </div> </div> </div> </div> </div>");
		out.println("<div class='contact-info'> <div class='option'> <i class='fas fa-map-marker-alt'></i> <div class='text'>India</div> </div> <div class='option'> <i class='fas fa-envelope'></i> <div class='text'>Singhajay9009735865@gmail.com</div> </div> <div class='option'> <i class='fas fa-mobile-alt'></i> <div class='text'>9009735865</div> </div> </div> <footer> <center><h3>© Online Library Management System</h3></center> </footer>");
		
		out.println("</body> </html>");
		
	}

}
