package jdbcconnectivity;

import java.sql.*;

public class CallableStatement {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "password");
			
			java.sql.CallableStatement stmt = con.prepareCall("{call USP_USERDATA_INSERT(?,?)}"); 
			
			stmt.setInt(1, 11);
			stmt.setString(2, "Shane Dawn");
			stmt.execute();
			
			System.out.println("Success.");
			con.close();
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
