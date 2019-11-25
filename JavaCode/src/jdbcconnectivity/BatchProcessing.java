package jdbcconnectivity;

import java.sql.*;
import java.io.*;

public class BatchProcessing {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "password");
			con.setAutoCommit(false);
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?)");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				
				System.out.print("Enter Employee ID    : ");
				String id = br.readLine();
				int emp_id = Integer.parseInt(id);
				
				System.out.print("Enter Employee Name : ");
				String name = br.readLine();
				
				ps.setInt(1, emp_id);
				ps.setString(2, name);
				
				ps.addBatch(); //To insert Batch Of Records
				
				System.out.print("Want to add more records(y/n) :");	
				String reply = br.readLine();
				
				if(reply.equalsIgnoreCase("n")) {
					break;
				}
				
			}
			
			ps.executeBatch(); // To execute Batch Records
			
			System.out.println("Records Successfully Added.");
			
			con.commit();
			con.close();
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
