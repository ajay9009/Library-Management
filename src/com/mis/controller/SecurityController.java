package com.mis.controller;

import java.sql.ResultSet;

import com.mis.dao.DBHelper;
import com.mis.model.Security;



public class SecurityController {
	public static Security checkLogin(String id,String password)
	{
	try{
		String query="select * from securitycheck where RollNo='"+id+"' and Password='"+password+"'";
		ResultSet rs=DBHelper.executeQuery(query);
		if(rs.next())
		{Security lseq=new Security();
		lseq.setRollno(rs.getString(1));
		lseq.setPassword(rs.getString(2));
		return(lseq);
	 	}
		return(null);	

	}catch(Exception e){System.out.println("Security:checklogin"+e);
	return (null);}
	}
	

	public static boolean addNewRecord(Security seq)
	{try{
	 String query="insert into securitycheck values('"+seq.getRollno()+"','"+seq.getPassword()+"')";
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:addNewRecord()"+e);
		}
	return(false);	

	

}
	public static Security show(String eid)
	{try{
	 String query="select Seq.RollNo,Seq.Password from securitycheck Seq where Seq.RollNo='"+eid+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 if(rs.next())
	 {Security Seq=new Security();
	 Seq.setRollno(rs.getString(1));
	 Seq.setPassword(rs.getString(2));
	 return(Seq);
	 }
	 return(null);
	 
	}catch(Exception e)
	{ System.out.println("Error:"+e);
		}
	return(null);	

	}


}
