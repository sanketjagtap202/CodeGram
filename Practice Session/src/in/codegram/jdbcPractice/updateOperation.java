package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class updateOperation {

	
	private static Logger logger = Logger.getLogger(updateOperation.class);
	
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
	
	// String q = "update customers set name = 'Prem Verma' where id = 6";
	 String q = "update customers set name = 'Steve Job' where id = 7";
	
	// Execute Querry: 
	
	stmt.execute(q);
	
	logger.info("Record Updated Succesfully!!!");
	
	stmt.close();
	con.close();
		

	}

}
