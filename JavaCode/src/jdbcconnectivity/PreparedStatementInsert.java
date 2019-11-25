package jdbcconnectivity;

import java.sql.*;

public class PreparedStatementInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "password");

		PreparedStatement preparestmt = con.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?)");

		preparestmt.setInt(1, 11);
		preparestmt.setString(2, "Nick Gilmore");

		preparestmt.setInt(1, 12);
		preparestmt.setString(2, "James Gnomes");

		preparestmt.setInt(1, 13);
		preparestmt.setString(2, "Ivy Mores");

		int result = preparestmt.executeUpdate();

		ResultSet rs = preparestmt.executeQuery("SELECT * FROM EMPLOYEE");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));

		con.close();

	}

}
