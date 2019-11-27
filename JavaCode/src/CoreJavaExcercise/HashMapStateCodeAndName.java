package CoreJavaExcercise;

import java.io.*;
import java.util.*;

public class HashMapStateCodeAndName {

	public static void main(String[] args) throws Exception {

		File state_file = new File("C:\\Users\\gargh\\OneDrive\\Desktop\\USA_States.txt");

		BufferedReader bufferreader = new BufferedReader(new FileReader(state_file));

		// Data in File
		System.out.println("Code  State Name");
		System.out.println("----  -----------");
		String st;
		String state_name;
		String state_code;
		int st_name;
		int st_code;

		while ((st = bufferreader.readLine()) != null) {

			List<String> statecode_list = Arrays.asList(st);
			
			for (String st1 : statecode_list) {

				st_name = st1.indexOf(" ");
				state_name = st1.substring(0, st_name);

				st_code = st1.lastIndexOf(" ");
				state_code = st1.substring(st_code+1);

				Map<String, String> hashmap_data = new HashMap<>();
				hashmap_data.put(state_code, state_name);
				System.out.print(hashmap_data.keySet() + " " + hashmap_data.values());
				System.out.println();

			}

		}

		bufferreader.close();

	}

}
