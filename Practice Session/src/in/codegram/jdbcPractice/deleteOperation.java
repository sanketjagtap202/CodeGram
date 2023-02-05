package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class deleteOperation {

	private static Logger logger = Logger.getLogger(deleteOperation.class);

	public static void main(String[] args) throws Exception {

		// Gather DB information:
		
		String url ="jdbc:mysql://localhost/codegramdb";
		String userName = "root";
		String password = "admin";
		
		// Register Driver & Load Driver:
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		 Class c = Class.forName(driverClassName);
		 c.newInstance();
		 
		 // create Connection Object:
		 
		Connection con =  DriverManager.getConnection(url, userName, password);
		 
		// Create a statement using con obj:
		
	Statement stmt = con.createStatement();
	
	// Create a querry for delete:
	
	String q = "delete from customers where id= 8";
	
	// Execute the query using stmt:
	stmt.executeUpdate(q);
	logger.info("Record deleted successfully!!!");
	
	// Close Resources:
	
	stmt.close();
	con.close();
	
		
		


	}

}
