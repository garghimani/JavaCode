package CoreJavaExcercise;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\gargh\\eclipse-workspace\\Test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		int count = 0;
		char ch = 'a';

         try {
        	 while((st = br.readLine()) != null) {
        		 System.out.println(st);
        		 if( st.indexOf(ch) != -1) {
        			 count = count+1;
        		 }
        	 }
        	 System.out.println();
        	 System.out.println("Number of times letter 'a' in file  : "+count);
         }
		catch(IOException e) {
			System.out.println("IO Exception : "+e);
		}

	}

}
