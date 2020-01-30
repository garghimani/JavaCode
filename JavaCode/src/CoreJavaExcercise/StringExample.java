package CoreJavaExcercise;

import java.util.Arrays;

public class StringExample {

	// Checks for the largest common prefix
	public static String lcp(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);
	}

	// Function to swap characters at position i with one at position j
	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char temp;
		temp = b[i];
		b[i] = b[j];
		b[j] = temp;
		return String.valueOf(b);
	}

	// Function for generating different permutation of string
	public static void generatePermutation(String swapStr, int start, int end) {
		if (start == end - 1) {
			System.out.println(swapStr);
		} else {
			for (int i = start; i < end; i++) {
				swapStr = swapString(swapStr, start, i);
				generatePermutation(swapStr, start + 1, end);
				swapStr = swapString(swapStr, start, i);
			}
		}
	}

	public static void main(String[] args) {

		// Calculating total characters in a string
		String str = "The best of both worlds";
		int count = 0;
		System.out.println("TOTAL NUMBER OF CHARACTERS IN STRING");
		System.out.println("-------------------------------------");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total charaters in string are : " + count);

		// Checking for all vowels and constants in string
		System.out.println();
		System.out.println("TOTAL VOWELS AND CONSTANTS IN STRING");
		System.out.println("-------------------------------------");
		str = str.toLowerCase();
		int vCount = 0, cCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("Total Vowels in String : " + vCount);
		System.out.println("Total Constants in String : " + cCount);

		// Checking whether two strings are anagram(contains same alphabets)
		System.out.println();
		System.out.println("STRINGS ARE ANAGRAM");
		System.out.println("--------------------");
		String str1 = "Brag";
		String str2 = "Grab";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Strings are not Anagram.");
		} else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Strings are Anagram.");
			} else {
				System.out.println("Strings are not Anagram.");
			}
		}

		// Diving string into n equal parts
		System.out.println();
		System.out.println("DIVIDE STRING INTO N EQUAL PARTS");
		System.out.println("--------------------------------");
		String str3 = "aaaabbbbcccc";
		int len = str3.length();
		int n = 3;
		int chars = len / n;
		int temp = 0;
		String[] equalStr = new String[n];
		if (len % n != 0) {
			System.out.println("String cannot be divided in equal parts.");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				String part = str3.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of String are : ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}

		// Finding all the subsets of a string
		System.out.println();
		System.out.println("FIND ALL SUBSETS OF STRING");
		System.out.println("----------------------------");
		String str4 = "FUN";
		int temp1 = 0;
		int strLength = str4.length();
		String[] arr = new String[strLength * (strLength + 1) / 2];
		for (int i = 0; i < strLength; i++) {
			for (int j = i; j < strLength; j++) {
				arr[temp1] = str4.substring(i, j + 1);
				temp1++;
			}
		}
		System.out.println("All subsets of String are...");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Checking for longest repeating sequence in a String
		System.out.println();
		System.out.println("LONGEST REPEATING SEQUENCE IN A STRING");
		System.out.println("---------------------------------------");
		String str5 = "acbdfghybdf";
		int str5Len = str5.length();
		String lrs = "";
		for (int i = 0; i < str5Len; i++) {
			for (int j = i + 1; j < str5Len; j++) {
				String x = lcp(str5.substring(i, str5Len), str5.substring(j, str5Len));
				if (x.length() > lrs.length()) {
					lrs = x;
				}
			}
		}
		System.out.println("Longest repeating sequence is : " + lrs);

		// Checking for all the permutations of a string
		System.out.println();
		System.out.println("ALL PERMUTATIONS OF STRING");
		System.out.println("----------------------------");
		String str6 = "ABC";
		int swapLen = str6.length();
		System.out.println("All the permutaions of string are : ");
		generatePermutation(str6, 0, swapLen);

		// Removing all white spaces
		System.out.println();
		System.out.println("REMOVE ALL WHITE SPACES FROM STRING");
		System.out.println("------------------------------------");
		str = str.replaceAll("\\s+", "");
		System.out.println("String after replacing all white spaces :");
		System.out.println(str);

		// Case Conversion of characters in a String
		System.out.println();
		System.out.println("REPLACE UPPER CASE TO LOWER CASE AND VICE VERSA");
		System.out.println("------------------------------------------------");
		String str7 = "Great Power";
		StringBuffer newStr = new StringBuffer(str7);
		for (int i = 0; i < str7.length(); i++) {
			if (Character.isUpperCase(str7.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(str7.charAt(i)));
			} else if (Character.isLowerCase(str7.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(str7.charAt(i)));
			}
		}
		System.out.println("String after case conversion : ");
		System.out.println(newStr);

		// Replacing spaces with special characters in string
		System.out.println();
		System.out.println("REPLACING SPACES WITH SPECIAL CHARACTER");
		System.out.println("----------------------------------------");
		String str8 = "Once in a blue moon.";
		str8 = str8.replace(' ', '-');
		System.out.println("New String : " + str8);

		// Checking String is Palindrome
		System.out.println();
		System.out.println("STRING IS PALINDROME");
		System.out.println("---------------------");
		String str9 = "Kayak";
		str9 = str9.toLowerCase();
		boolean flag = true;
		for (int i = 0; i < str9.length() / 2; i++) {
			if (str9.charAt(i) != str9.charAt(str9.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("String is Palindrome.");
		} else {
			System.out.println("String is not Palindrome.");
		}

		// Checking One String is rotation of Second String
		System.out.println();
		System.out.println("ONE STRING IS ROTATION OF OTHER STRING");
		System.out.println("---------------------------------------");
		String str10 = "abcde";
		String str11 = "deabc";
		if (str10.length() != str11.length()) {
			System.out.println("Second String is not rotation of first string.");
		} else {
			str10 = str10.concat(str10);
			if (str10.indexOf(str11) != -1) {
				System.out.println("Second String is rotation of First String.");
			} else {
				System.out.println("Second String is not rotation of first string.");
			}
		}

		// Reverse the String
		System.out.println();
		System.out.println("REVERSE STRING");
		System.out.println("---------------");
		String str12 = "Great Responsibility";
		String reverseStr = "";
		for (int i = str12.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str12.charAt(i);
		}
		System.out.println("Reversed String is : " + reverseStr);

		// To check duplicate characters in a String
		System.out.println();
		System.out.println("DUPLICATE CHARACTERS IN A STRING");
		System.out.println("---------------------------------");
		int dupCount = 0;
		str12 = str12.toLowerCase();
		char[] dupString = str12.toCharArray();
		for (int i = 0; i < dupString.length; i++) {
			dupCount = 1;
			for (int j = i + 1; j < dupString.length; j++) {
				if (dupString[i] == dupString[j] && dupString[i] != ' ') {
					dupCount++;
					dupString[j] = '0';
				}
			}
			if (dupCount > 1 && dupString[i] != '0') {
				System.out.println(dupString[i]);
			}
		}

		// Minimum and Maximum occurring character in a String
		System.out.println();
		System.out.println("MIN AND MAX OCCURRING CHARACTER IN A STRING");
		System.out.println("--------------------------------------------");
		String str13 = "grass is greener on the other side";
		int[] freq = new int[str13.length()];
		char minChar = str13.charAt(0), maxChar = str13.charAt(0);
		int i, j, min, max;
		char[] charString = str13.toCharArray();
		for (i = 0; i < charString.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < charString.length; j++) {
				if (charString[i] == charString[j] && charString[i] != ' ' && charString[i] != '0') {
					freq[i]++;
					charString[j] = '0';
				}
			}
		}
		min = max = freq[0];
		for (i = 0; i < freq.length; i++) {
			if (min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = charString[i];
			}
			if (max < freq[i]) {
				max = freq[i];
				maxChar = charString[i];
			}
		}
		System.out.println("Maximum occurring character is : " + maxChar);
		System.out.println("Minimum occurring character is : " + minChar);

		// Find the duplicate words in the String
		System.out.println();
		System.out.println("DUPLICATE WORDS IN THE STRING");
		System.out.println("-------------------------------");
		String str14 = "Big black bug bit a big black dog on his big black nose";
		str14 = str14.toLowerCase();
		String words[] = str14.split(" ");
		int countDupWords = 0;
		for (i = 0; i < words.length; i++) {
			countDupWords = 1;
			for (j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					countDupWords++;
					words[j] = "0";
				}
			}
			if (countDupWords > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
		}

	}
}
