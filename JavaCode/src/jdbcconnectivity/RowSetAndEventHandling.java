package jdbcconnectivity;

import java.sql.*;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetAndEventHandling {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();	
			
			rowset.setUrl("jdbc:mysql://localhost:3306/dev");
			rowset.setUsername("root");
			rowset.setPassword("password");
			
			rowset.setCommand("SELECT * FROM EMPLOYEE");
			rowset.execute();
			
			//Adding Events To Fetching of Data from Database
			rowset.addRowSetListener(new MyListener());
			
			while(rowset.next()) {
				
				System.out.print("EMP_ID : "+rowset.getInt(1)+"        ");
				System.out.println("EMP_NAME : "+rowset.getString(2));
				
			}
			
			rowset.close();
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}

class MyListener implements RowSetListener{

	@Override
	public void cursorMoved(RowSetEvent event) {
		System.out.println("Cursor Moved....");
		
	}

	@Override
	public void rowChanged(RowSetEvent arg0) {
		System.out.println("Row Changed....");
		
	}

	@Override
	public void rowSetChanged(RowSetEvent arg0) {
		System.out.println("RowSet Changed....");
		
	}
	
}
