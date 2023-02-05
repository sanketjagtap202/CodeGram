package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class deleteOperation2 {

	private static Logger logger = Logger.getLogger(deleteOperation2.class);

	public static void main(String[] args) throws Exception {

		// Gather db Information:

		String url = "jdbc:mysql://localhost/codegramdb"; // jdbc:mysql://localhost/test?
		String user = "root";
		String password = "admin";

		// Register Driver & Load Driver;

		String driverClassname = "com.mysql.cj.jdbc.Driver"; // com.mysql.jdbc.Driver
		Class c = Class.forName(driverClassname);
		c.newInstance();

		// Create Connection Object:

		Connection con = DriverManager.getConnection(url, user, password);

		// create Statement using con object:

		Statement stmt = con.createStatement();
		
		// Create a querry for delete:
		
		String q = "delete from customers where id=4";
		
		// Execute a querry using stmt.
		
		stmt.executeUpdate(q);
		logger.info("Record deleted successfully!!!");
		
		stmt.close();
		con.close();

	}

}
