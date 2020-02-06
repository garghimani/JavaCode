package javaquestions;

public class LongestSubString {

	public static String longSubStr(String x, String y) {
		int len = Math.min(x.length(), y.length());
		for (int i = 0; i < len; i++) {
			if (x.charAt(i) != y.charAt(i)) {
				return x.substring(0, i);
			}
		}
		return x.substring(0, len);
	}

	public static void main(String[] args) {

		// Longest Substring without repeating characters.
		String str = "ababcd";
		str = str.toLowerCase();
		String temp = "";

		int str_length = str.length();
		for (int i = 0; i < str_length; i++) {
			for (int j = i + 1; j < str_length; j++) {
				String long_str = longSubStr(str.substring(i, str_length), str.substring(j, str_length));
				if (long_str.length() > temp.length()) {
					temp = long_str;
				}
			}
		}
		System.out.println("Longest Sub String without repeting character is : " + temp);

	}

}
