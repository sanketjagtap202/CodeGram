package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class InsertOperation {

 private static Logger logger = Logger.getLogger(InsertOperation.class);
	
	public static void main(String[] args) throws Exception {
		// 1. Create/gather DB information:
		
		String url = "jdbc:mysql://localhost/codegramdb";
		String username = "root";
		String password = "admin";
		
		// 2. Register Driver and Lad Driver:
		String driverClassName = "com.mysql.cj.jdbc.Driver"; // register driver
		Class c = Class.forName(driverClassName); // load driver
			c.newInstance();
			
		// 3. Create Connection Object:
			
			Connection con = DriverManager.getConnection(url, username, password);
		
		// 4. Create Statement or prepareStatement Objet:
			Statement stmt = con.createStatement();

		// 5. Execute Query:
			String q = "insert into customers(name, phone) values ('Prem', '928984756')";
			stmt.execute(q);
			logger.info("Added Successfully!!!");
		// Release resources(stmt, con)
			stmt.close();
			con.close();
			
	}

}
