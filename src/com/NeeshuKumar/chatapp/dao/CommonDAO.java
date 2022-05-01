package com.NeeshuKumar.chatapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDAO {
	
	private static CommonDAO commonDAO;
	
	private CommonDAO()
	{
		
	}
	public static CommonDAO getInstance()
	{
		if(commonDAO == null)
		{
			commonDAO=new CommonDAO();
		}
		return commonDAO;
	}
	
	public Connection createConnection() throws SQLException, ClassNotFoundException
	{
		//Returns the Class object associated with the class or interface with the given string name, 
		//using the given class loader.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/chatapp","root","N-T-ha11");
		return con;
	}

}
