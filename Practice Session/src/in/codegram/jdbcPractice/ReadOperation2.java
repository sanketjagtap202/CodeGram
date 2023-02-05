package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class ReadOperation2 {

	private static Logger logger = Logger.getLogger(ReadOperation2.class);

	public static void main(String[] args) throws Exception {

		// Gather DB information:

		String url = "jdbc:mysql://localhost/codegramdb";
		String user = "root";
		String password = "admin";

		// Register Driver and Load Driver:

		String driverClassname = "com.mysql.cj.jdbc.Driver";
		Class c = Class.forName(driverClassname);
		c.newInstance();

		// Create connection Object:

		Connection con = DriverManager.getConnection(url, user, password);

		// Create a statement using con:

		Statement stmt = con.createStatement();

		// Write a Querry for rading a data from database:

		String q = "Select * from customers";

		//Execute a querry:
		
		ResultSet rs = stmt.executeQuery(q);

		while(rs.next()) {
			
			int id = rs.getInt("ID");
			String name = rs.getNString("name");
			String phone = rs.getNString("phone");
			
			System.out.println(id+ ")  "+name+"----"+phone);
		}
		
		// Close resources:
		
		stmt.close();
		con.close();
		
	}

}
