package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnection() 
	{
		Connection con=null;
		//1. load driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Create connection object
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/world", "root", "helloworld");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
