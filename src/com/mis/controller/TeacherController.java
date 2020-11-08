package com.mis.controller;

import java.sql.ResultSet;

import com.mis.dao.DBHelper;
import com.mis.model.Admin;
import com.mis.model.Students;
import com.mis.model.Teachers;
import com.mis.dao.DBHelper;
import com.mis.model.Teachers;


public class TeacherController {
	
	public static boolean addNewRecord(Teachers S)
	{try{
	 String query="insert into teachers values('"+S.getTeacherid()+"','"+S.getFname()+"','"+S.getLname()+"','"+S.getDepartment()+"','"+S.getEmail()+"',"+S.getMobile()+",'"+S.getPicture()+"')";
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:addNewRecord()"+e);
		}
	return(false);	

	

}
	
	public static boolean editRecord(Teachers E)
	{try{
	 String query="update teachers set firstname='"+E.getFname()+"',lastname='"+E.getLname()+"',department='"+E.getDepartment()+"',email='"+E.getEmail()+"',mobile='"+E.getMobile()+"'where teacherid='"+E.getTeacherid()+"'";
	 System.out.println(query);
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:editRecord()"+e);
		}
	return(false);	

	}

	public static boolean editPicture(String uid,String filename)
	{try{
	 String query="update teachers set picture='"+filename+"' where teacherid='"+uid+"'";
	 System.out.println(query);
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:editRecord()"+e);
		}
	return(false);	

	}





	public static boolean deleteRecord(String uid)
	{try{
	 String query="Delete from teachers where teacherid='"+uid+"'";
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:deleteRecord()"+e);
		}
	return(false);	

	}
	
	public static ResultSet displayAll()
	{try{
	 String query="select E.teacherid,E.firstname,E.lastname,E.department,E.email,E.mobile,E.picture from teachers E";
	 ResultSet rs=DBHelper.executeQuery(query);
	 return(rs);
		
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}
	public static Teachers displayByID(String uid)
	{try{
	 String query="select E.teacherid,E.firstname,E.lastname,E.department,E.email,E.mobile,E.picture from teachers E where E.teacherid='"+uid+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 if(rs.next())
	 {
	 Teachers E=new Teachers();
	 E.setTeacherid(rs.getString(1));
	 E.setFname(rs.getString(2));
	 E.setLname(rs.getString(3));
	 E.setDepartment(rs.getString(4));
	 E.setEmail(rs.getString(5));
	 E.setMobile(rs.getString(6));
	 E.setPicture(rs.getString(7));
	 return(E);
	 
	 
		 
		 
	 }
	 return(null);
	 
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}
	
	public static Teachers checkLogin(String id,String password)
	{
	try{
		String query="select * from teachers where teacherid='"+id+"'";
		ResultSet rs=DBHelper.executeQuery(query);
		if(rs.next())
		{Teachers tch=new Teachers();
		tch.setTeacherid(rs.getString(1));
		tch.setFname(rs.getString(2));
		tch.setLname(rs.getString(3));
		tch.setPicture(rs.getString(7));
		
		return(tch);
	 	}
		return(null);	

	}catch(Exception e){System.out.println("Teachers:checklogin"+e);
	return (null);}
	}
	
	public static Teachers show(String eid)
	{try{
	 String query="select S.teacherid,S.email from teachers S where S.teacherid='"+eid+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 if(rs.next())
	 {Teachers S=new Teachers();
	 S.setTeacherid(rs.getString(1));
	 S.setEmail(rs.getString(2));
	 return(S);
	 }
	 return(null);
	 
	}catch(Exception e)
	{ System.out.println("Error:"+e);
		}
	return(null);	

	}


}

