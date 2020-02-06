package javaquestions;

public class ReverseWordsInString {

	public static void main(String[] args) {		
		
        //Reverse the words in a String
		String str = "Hello World";
		String[] str_arr = str.split(" ");
		String reverse_str = "";

		for (int j = 0; j < str_arr.length; j++) {
			String temp = str_arr[j]+" ";
			for(int i=temp.length()-1;i>=0;i--) {
				reverse_str = reverse_str+ temp.charAt(i);
			}

		}
		System.out.println(reverse_str);
	}

}
