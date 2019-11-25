package jdbcconnectivity;

import java.sql.*;

public class DataBaseMetaData {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "password");
			
			DatabaseMetaData dbmd = con.getMetaData();	
			
			System.out.println("Driver Name : "+dbmd.getDriverName());
			System.out.println("Driver Version : "+dbmd.getDriverVersion());
			System.out.println("UserName : "+dbmd.getUserName());
			System.out.println("URL : "+dbmd.getURL());
			System.out.println("Database Product Name : "+dbmd.getDatabaseProductName());
			System.out.println("Database Product Version : "+dbmd.getDatabaseProductVersion());
			System.out.println();
			
			//To check the tables present in the database
			String table[] = {"TABLE"};
			ResultSet rs = dbmd.getTables(null, null, null, table);
			
			while(rs.next())
				System.out.println("Tables in Database "+rs.getString(1)+" is : "+rs.getString(3));
			    System.out.println();
			
			//To check the views present in the database     
			String table_view[] = {"VIEW"};
			ResultSet rs_view = dbmd.getTables(null, null, null, table_view);
			
			while(rs_view.next())
				System.out.println("Views in Database "+rs_view.getString(1)+" is : "+rs_view.getString(3));
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}

	}

}
