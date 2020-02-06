package javaquestions;

public class MostRepeatedWord {

	public static void main(String[] args) {

		//Most Repeated word in a sentence
		String str = "Big black bug bit a big black dog on his big black nose";
		str = str.toLowerCase();
		String[] str_arr = str.split(" ");
		int count_dup = 0;
		for (int i = 0; i < str_arr.length; i++) {
			count_dup = 1;
			for (int l = i + 1; l < str_arr.length; l++) {
				if (str_arr[i].equals(str_arr[l])) {
					count_dup++;
					str_arr[l] = "0";
				}
			}
			if (count_dup > 1 && str_arr[i] != "0") {
				System.out.println(str_arr[i]);
			}

		}
	}

}
