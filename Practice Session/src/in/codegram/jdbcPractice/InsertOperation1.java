package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class InsertOperation1 {

	
	private static Logger logger = Logger.getLogger(InsertOperation1.class);
	
	public static void main(String[] args) throws Exception {
	// Gather DB information:
		
		String url = "jdbc:mysql://localhost/codegramdb";
		String username = "root";
		String password = "admin";
		
		// Generate Driver and Load Driver:
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		
		Class c = Class.forName(driverClassName);
		c.newInstance();
		
		// Create Connection Object:
		Connection con = DriverManager.getConnection(url, username, password);
		
		// Create Statement or prepareStatement:
		
		Statement stmt =con.createStatement();
		
		// Execute Querry:
		
		String q = "insert into customers(name, phone) Values ('Brian', '1919191')";
		
		stmt.execute(q);
		logger.info("Added Successfully!!");
		
		// Close resources:
		
		stmt.close();
		con.close();
	}

}
