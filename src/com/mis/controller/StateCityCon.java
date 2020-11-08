package com.mis.controller;

import java.sql.ResultSet;

import com.mis.dao.DBHelper;


public class StateCityCon {
	public static ResultSet fetchAllStates()
	{try
	{ ResultSet rs=DBHelper.executeQuery("select * from states");
		return(rs);
	}catch(Exception e)
	{System.out.println("Error:fetchAllState()"+e);
		}
	return(null);
		}
		
	public static ResultSet fetchAllCities(int stateid)
	{try
	{ ResultSet rs=DBHelper.executeQuery("select * from cities where stateid="+stateid);
		return(rs);
	}catch(Exception e)
	{System.out.println("Error:fetchAllState()"+e);
		}
	return(null);
		}


}
