package jdbcconnectivity;

import java.sql.*;

public class JDBCConnectivity {

	public static void main(String[] args) {
		try {
			// Load the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// Create the connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root",
					"password");

			// Create the statement object
			Statement stmt = con.createStatement();
			
			//INSERT
		//	int result = stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES (10, 'Dana Samuel')");
		//	System.out.println(result +" rows inserted.");
			System.out.println();
			
			//UPDATE
			stmt.executeUpdate("UPDATE EMPLOYEE SET emp_name = 'Lily Thomas' WHERE emp_id = 3");

			// Execute query
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

			// Close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
