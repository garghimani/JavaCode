package javaquestions;

import java.util.Arrays;

public class RepeatedChar {

	public static void main(String[] args) {

		String str = "abcbde";
		str = str.toLowerCase();
		char[] char_str = str.toCharArray();
		char max_char = str.charAt(0);
		int[] count = new int[str.length()];
		int max;
		for (int i = 0; i < char_str.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < char_str.length; j++) {
				if ((char_str[i] == char_str[j]) && char_str[i] != ' ' && char_str[i] != '0') {
					count[i]++;
					char_str[j] = '0';
				}

			}

		}
		max = count[0];

		for (int i = 0; i < count.length; i++) {
			if (max < count[i] && count[i] != '0') {
				max = count[i];
				max_char = char_str[i];
			}

		}
		System.out.println("Most repeated character is :" + max_char);

		System.out.println("Number of times each character repeated");
		for (int i = 0; i < count.length; i++) {
			if (count[i] != '0' && char_str[i] != '0') {
				System.out.println(char_str[i] + " " + count[i]);
			}
		}

		System.out.println("In the order of repetitions : ");
		Arrays.sort(count);
		for (int i = count.length - 1; i >= 0; i--) {
			if (count[i] != '0' && char_str[i] != '0')
				System.out.println(char_str[i] + " " + count[i]);
		}
	}

}
