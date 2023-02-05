package in.codegram.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class updateOperation2 {

	private static Logger logger = Logger.getLogger(updateOperation2.class);

	public static void main(String[] args) throws Exception {

		// Gather Db information:

		String url = "jdbc:mysql://localhost/codegramdb";
		String user = "root";
		String password = "admin";

		// Register Driver and Load Driver:

		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Class c = Class.forName(driverClassName);
		c.newInstance();

		// Create Connection Object:

		Connection con = DriverManager.getConnection(url, user, password);

		// Create Statement using con object:

		Statement stmt = con.createStatement();

		// Create a Querry for Update records:

String sql = "update customers  SET phone='33333333', name = 'Jordan Messi' where id =3";

// Update querry using stmt:

stmt.executeUpdate(sql);
logger.info("Record updated Successfully!!!");

// Close sources:

stmt.close();
con.close();

	}

}
