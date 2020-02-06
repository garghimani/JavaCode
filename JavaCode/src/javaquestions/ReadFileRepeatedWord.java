package javaquestions;

import java.io.*;
import java.util.*;
import java.util.Set;

public class ReadFileRepeatedWord {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\Users\\gargh\\eclipse-workspace\\Test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str, words = "";
		int count, maxCount = 0;

		try {

			// Using HashMap
			Map<String, Integer> hashmap = new HashMap<>();
			while ((str = br.readLine()) != null) {
				String[] string = str.toLowerCase().split(" ");
				for (String word : string) {
					if (hashmap.containsKey(word) && hashmap.get(word) != null) {
						hashmap.put(word, (hashmap.get(word) + 1));
					} else {
						hashmap.put(word, 1);
					}
				}
			}

			String mostRepeatedWord = null;

			Set<Map.Entry<String, Integer>> mapentry = hashmap.entrySet();
			for (Map.Entry<String, Integer> me : mapentry) {

				if (me.getValue() > maxCount) {
					mostRepeatedWord = me.getKey();
					maxCount = me.getValue();
				}

			}

			System.out.println("Word : " + mostRepeatedWord + "\nNo. of times Repeated : " + maxCount);

			// Using Array List
			List<String> list = new ArrayList<>();

			while ((str = br.readLine()) != null) {

				String string[] = str.toLowerCase().split(" ");
				for (String s : string) {
					list.add(s);
				}
			}

			for (int i = 0; i < list.size(); i++) {
				count = 1;
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).equals(list.get(j))) {
						count++;
					}
				}
				// System.out.println(list.get(i)+" "+list.get(j)); count++; } }

				if (count > maxCount) {
					maxCount = count;
					words = list.get(i);

				}
			}
			System.out.println("Word : " + words + "\nNo.of times repeated : " + maxCount);
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
