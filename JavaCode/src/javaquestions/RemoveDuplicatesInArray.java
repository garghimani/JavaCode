package javaquestions;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 6, 6 };
		int[] temp_array = new int[arr.length];
		int j = 0;
		
		//Remove Duplicates from an Array
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp_array[j++] = arr[i];
			}
		}

		temp_array[j++] = arr[arr.length - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp_array[i];
		}

		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
