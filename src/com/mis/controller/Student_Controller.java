package com.mis.controller;



import java.sql.ResultSet;

import com.mis.dao.DBHelper;
import com.mis.model.Students;
import com.mis.model.Teachers;





public class Student_Controller {
	public static Students checkLogin(String id,String password)
	{
	try{
		String query="select * from students where RollNo='"+id+"'";
		ResultSet rs=DBHelper.executeQuery(query);
		if(rs.next())
		{Students studt=new Students();
		studt.setRollno(rs.getString(1));
		studt.setFname(rs.getString(2));
		studt.setLname(rs.getString(3));
		studt.setBranch(rs.getString(4));
		studt.setEmail(rs.getString(6));
		studt.setPicture(rs.getString(11));
		
		return(studt);
	 	}
		return(null);	

	}catch(Exception e){System.out.println("Students:checklogin"+e);
	return (null);}
	}

	public static boolean addNewRecord(Students S)
	{try{
	 String query="insert into students values('"+S.getRollno()+"','"+S.getFname()+"','"+S.getLname()+"','"+S.getBranch()+"','"+S.getDateofadmission()+"','"+S.getEmail()+"',"+S.getMobile()+",'"+S.getState()+"','"+S.getCity()+"','"+S.getAddress()+"','"+S.getPicture()+"')";
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:addNewRecord()"+e);
		}
	return(false);	

	

}
	public static Students show(String eid)
	{try{
	 String query="select S.RollNo,S.Email from students S where S.RollNo='"+eid+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 if(rs.next())
	 {Students S=new Students();
	 S.setRollno(rs.getString(1));
	 S.setEmail(rs.getString(2));
	 return(S);
	 }
	 return(null);
	 
	}catch(Exception e)
	{ System.out.println("Error:"+e);
		}
	return(null);	

	}
	
	public static ResultSet displayAll()
	{try{
	 String query="select E.rollno,E.fname,E.lname,E.branch,E.dateofaddmission,E.email,E.mobile,E.state,E.city,E.picture,(select statename from states S where S.stateid=E.state),(select cityname from cities C where C.cityid=E.city) from students E";
	 ResultSet rs=DBHelper.executeQuery(query);
	 return(rs);
		
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}
	public static Students displayByID(String eid)
	{try{
	 String query="select E.rollno,E.fname,E.lname,E.branch,E.dateofaddmission,E.email,E.mobile,E.state,E.city,E.address,E.picture,(select statename from states S where S.stateid=E.state),(select cityname from cities C where C.cityid=E.city) from students E where E.rollno='"+eid+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 if(rs.next())
	 {
		 Students E=new Students();
		 E.setRollno(rs.getString(1));
		 E.setFname(rs.getString(2));
		 E.setLname(rs.getString(3));
		 E.setBranch(rs.getString(4));
		 E.setDateofadmission(rs.getString(5));
		 E.setEmail(rs.getString(6));
		 E.setMobile(rs.getString(7));
		 E.setState(rs.getString(8)+","+rs.getString(12));
		 E.setCity(rs.getString(9)+","+rs.getString(13));
		 E.setAddress(rs.getString(10));
		 E.setPicture(rs.getString(11));
	 return(E);
	 	 
		 
	 }
	 return(null);
	 
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}
	
	public static boolean editRecord(Students E)
	{try{
	 String query="update students set fname='"+E.getFname()+"',lname='"+E.getLname()+"',branch='"+E.getBranch()+"',email='"+E.getEmail()+"',state='"+E.getState()+"',city='"+E.getCity()+"',address='"+E.getAddress()+"',mobile='"+E.getMobile()+"'where rollno='"+E.getRollno()+"'";
	 System.out.println(query);
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:editRecord()"+e);
		}
	return(false);	

	}

	public static boolean editPicture(String eid,String filename)
	{try{
	 String query="update students set picture='"+filename+"' where rollno='"+eid+"'";
	 System.out.println(query);
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:editRecord()"+e);
		}
	return(false);	

	}





	public static boolean deleteRecord(String eid)
	{try{
	 String query="Delete from students where rollno='"+eid+"'";
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:deleteRecord()"+e);
		}
	return(false);	

	}




}
