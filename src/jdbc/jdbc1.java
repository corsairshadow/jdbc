package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {
	public static void main(String [] args) 
	{
		
//		addStudent();
		print();
	}	
	
	public static void addStudent() 
	{
		try(Connection con=JdbcUtil.getConnection()) {
		
		String sqlq="insert into world.school values(?,?,?,?,?)";
			PreparedStatement stmt= con.prepareStatement(sqlq);
			//Can receive input from scanner
			stmt.setInt(1, 1);
			stmt.setString(2, "Zack");
			stmt.setString(3, "Eff");
			stmt.setString(4, "Queens");
			stmt.setString(5, "NYC");

			stmt.execute();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public static void print() 
	{
	Connection con=JdbcUtil.getConnection();
	String sqlq="select * from world.school";
	PreparedStatement stmt;
	try {
		stmt = con.prepareStatement(sqlq);
		ResultSet rs = stmt.executeQuery("select * from world.school");
		while(rs.next()) 
		{
			System.out.println(
					"ID: "+ rs.getInt(1)  
					+", LN: " +rs.getString(2)
					+", FN: "+rs.getString(3)
					+", A: "+ rs.getString(4)
					+", C: "+ rs.getString(5)+"\n");
		}	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
		
	}
}

