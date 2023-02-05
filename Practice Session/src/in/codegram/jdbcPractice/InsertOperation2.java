package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class InsertOperation2 {

	
	private static Logger logger = Logger.getLogger(InsertOperation2.class);
	
	public static void main(String[] args) throws Exception {
	
		// Gather DB information:
		
		String url ="jdbc:mysql://localhost/codegramdb";
		String userName = "root";
		String password="admin";
		
		
		// Register Driver and Load Driver:
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Class c = Class.forName(driverClassName);
		c.newInstance();
		
		// Create Connection con object:
		
	Connection con = 	DriverManager.getConnection(url, userName, password);
		
	// Create Statement from connection obj.
	
	Statement stmt = con.createStatement();
	
	// create a Querry :
	
	String q = "insert into customers(name, phone)  values('Mark', '985767464')";
	
	// Execute Querry: 
	
	stmt.execute(q);
	
	logger.info("Added Succesfully!!!");
	
	stmt.close();
	con.close();
		

	}

}
