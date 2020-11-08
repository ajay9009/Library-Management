package com.mis.controller;

import java.sql.ResultSet;

import com.mis.dao.DBHelper;

import com.mis.model.RequestBook;
import com.mis.model.Students;

public class RequestBookController {
	public static boolean addNewRecord(RequestBook S)
	{try{
	 String query="insert into requestbook values('"+S.getBook()+"')";
	 System.out.println(query);
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:addNewRecord()"+e);
		}
	return(false);	

	
}
	
	public static ResultSet displayAll()
	{try{
	 String query="select E.book from requestbook E";
	 ResultSet rs=DBHelper.executeQuery(query);
	 return(rs);
		
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}
	public static RequestBook displayUnique(String eid)
	{try{
	 String query="select E.book from requestbook E where E.book='"+eid+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 if(rs.next())
	 {
		 RequestBook E=new RequestBook();
		 E.setBook(rs.getString(1));
		
	 return(E);
	 	 
		 
	 }
	 return(null);
	 
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}
	
	public static boolean deleteRecord(String eid)
	{try{
	 String query="Delete from requestbook where book='"+eid+"'";
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:deleteRecord()"+e);
		}
	return(false);	

	}

}
