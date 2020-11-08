package com.mis.controller;

import java.sql.ResultSet;

import com.mis.dao.DBHelper;
import com.mis.model.Book;



public class BookController {
	public static Book displayByID(String eid)
	{try{
	 String query="select E.bookid,E.bookname,E.bookauther,E.booksubject,E.booktype,E.bookimage,E.bookdoc from books E where E.bookid='"+eid+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 if(rs.next())
	 {
		 Book E=new Book();
		 E.setBookid(rs.getString(1));
		 E.setBookname(rs.getString(2));
		 E.setAuthor(rs.getString(3));
		 E.setSubject(rs.getString(4));
		 E.setType(rs.getString(5));
		 E.setBookfront(rs.getString(6));
		 E.setUploadbook(rs.getString(7));
		 return(E);
	 	 
		 
	 }
	 return(null);
	 
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}
	public static ResultSet displayAllByName(String bname)
	{try{
	 String query="select B.bookid,B.bookname,B.bookauther,B.booksubject,B.booktype,B.bookimage,B.bookdoc from books B where B.bookname='"+bname+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 return(rs);
		
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}

	public static ResultSet displayAllBySub(String bsub)
	{try{
	 String query="select B.bookid,B.bookname,B.bookauther,B.booksubject,B.booktype,B.bookimage,B.bookdoc from books B where B.booksubject='"+bsub+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 return(rs);
		
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}
	public static ResultSet displayAllByAuth(String auth)
	{try{
	 String query="select B.bookid,B.bookname,B.bookauther,B.booksubject,B.booktype,B.bookimage,B.bookdoc from books B where B.bookauther='"+auth+"'";
	 ResultSet rs=DBHelper.executeQuery(query);
	 return(rs);
		
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}


	public static ResultSet displayAll()
	{try{
	 String query="select B.bookid,B.bookname,B.bookauther,B.booksubject,B.booktype,B.bookimage,B.bookdoc from books B";
	 ResultSet rs=DBHelper.executeQuery(query);
	 return(rs);
		
	}catch(Exception e)
	{ System.out.println("Error:displayAll()"+e);
		}
	return(null);	

	}

	public static boolean addNewRecord(Book S)
	{try{
	 String query="insert into books values('"+S.getBookid()+"','"+S.getBookname()+"','"+S.getAuthor()+"','"+S.getSubject()+"','"+S.getType()+"','"+S.getBookfront()+"','"+S.getUploadbook()+"')";
	 System.out.println(query);
	 boolean status=DBHelper.executeUpdate(query);
	 return(status);
		
	}catch(Exception e)
	{ System.out.println("Error:addNewRecord()"+e);
		}
	return(false);	

	
}
}