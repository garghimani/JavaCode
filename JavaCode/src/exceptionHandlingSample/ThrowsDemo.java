package exceptionHandlingSample;

import java.io.*;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {

		// Throws Exception as Test1 file not present
		// Replace Test1 by Test for the file output.

		File file = new File("C:\\Users\\gargh\\eclipse-workspace\\Test1.txt");

		BufferedReader bufferreader = new BufferedReader(new FileReader(file));

		String st;

		try {
			while ((st = bufferreader.readLine()) != null)
				System.out.println(st);
		} catch (IOException e) {
			System.out.println("IO Exception : " + e);
		}
	}

}
