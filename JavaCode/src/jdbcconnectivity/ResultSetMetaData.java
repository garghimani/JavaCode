package jdbcconnectivity;

import java.sql.*;

public class ResultSetMetaData {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "password");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMPLOYEE");
			ResultSet rs = ps.executeQuery();
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println("Total Columns : " + rsmd.getColumnCount());
			System.out.println("Column Name : " + rsmd.getColumnName(1));
			System.out.println("Column Type : " + rsmd.getColumnTypeName(1));

		}

		catch (Exception e) {

			System.out.println(e);

		}

	}

}
