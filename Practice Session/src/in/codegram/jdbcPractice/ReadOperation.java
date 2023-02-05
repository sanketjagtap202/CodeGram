package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class ReadOperation {

	Logger logger = Logger.getLogger(ReadOperation.class);

	public static void main(String[] args) throws Exception {

		// Gather DB information:

		String url = "jdbc:mysql://localhost/codegramdb";
		String user = "root";
		String password = "admin";

		// register Driver & Load Driver:

		String driverClassname = "com.mysql.cj.jdbc.Driver";
		Class c = Class.forName(driverClassname);
		c.newInstance();

		// Create a Connection Object:

		Connection con = DriverManager.getConnection(url, user, password);

		// Create a statement using con object:
		
		Statement stmt = con.createStatement();
		
		//create a querry for reading a data:

		String q = "Select * from customers";
		
			// Execute a querry:
		
	ResultSet rs = 	stmt.executeQuery(q);
		
		while(rs.next()) {
			
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			
			System.out.println("Name: "+ name + " -  Phone:  "+phone);
		}
		
		stmt.close();
		con.close();
	}

}
