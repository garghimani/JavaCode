package jdbcconnectivity;

import java.sql.*;
import java.io.*;

public class BinaryStream {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "password");

			System.out.println("---------- INSERTING AND RETRIEVING IMAGES FROM DATABASE -----------");
			// Inserting Image Into The Database
			PreparedStatement ps = con.prepareStatement("INSERT INTO IMGTABLE VALUES(?,?)");
			ps.setString(1, "Java Logo");

			FileInputStream fis = new FileInputStream("C:\\Users\\gargh\\OneDrive\\Pictures\\java_logo.png");
			ps.setBinaryStream(2, fis, fis.available());

			int i = ps.executeUpdate();
			System.out.println("Records Updated : " + i);

			fis.close();

			// Retrieving Image From Database
			PreparedStatement ps1 = con.prepareStatement("SELECT * FROM IMGTABLE");
			ResultSet rs = ps1.executeQuery();

			if (rs.next()) {

				Blob b = rs.getBlob(2);
				byte byteblob[] = b.getBytes(1, (int) b.length());

				// Location To Save The Image
				FileOutputStream fos = new FileOutputStream("C:\\Users\\gargh\\OneDrive\\Pictures\\java_logo1.png");
				fos.write(byteblob);

				fos.close();

			}

			System.out.println("OK.");

			System.out.println("---------- INSERTING AND RETRIEVING FILES FROM DATABASE -----------");

			// Inserting File Into Database
			PreparedStatement ps2 = con.prepareStatement("INSERT INTO FILETABLE VALUES(?,?)");

			File f = new File("C:\\Users\\gargh\\OneDrive\\Pictures\\Test.txt");
			FileReader fr = new FileReader(f);

			ps2.setInt(1, 101);
			ps2.setCharacterStream(2, fr, (int) f.length());

			int j = ps2.executeUpdate();
			System.out.println("Records Inserted : " + j);

			// Retrieving File From Database
			PreparedStatement ps3 = con.prepareStatement("SELECT * FROM  FILETABLE");
			ResultSet rs1 = ps3.executeQuery();
			rs1.next(); // Now on 1st row

			Clob fileclob = rs1.getClob(2); // Clob is used to get the file
			Reader r = fileclob.getCharacterStream();

			// Retrieving File from Database and writing at below location
			FileWriter fw = new FileWriter("C:\\Users\\gargh\\OneDrive\\Pictures\\Test_Write.txt");

			int k;
			while ((k = r.read()) != -1)
				fw.write((char) k);

			fw.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
