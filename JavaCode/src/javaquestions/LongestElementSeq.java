package javaquestions;

import java.util.Arrays;

public class LongestElementSeq {

	public static void main(String[] args) {

		int[] arr = { 100, 1, 2, 200, 3, 5, 7, 150, 4 };

		// Unsorted Array
		System.out.println("Unsorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Sorted Array
		System.out.println("Sorted Array");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Longest consecutive sequence in an array
		int[] temp_array = new int[arr.length];
		int j = 0;
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i + 1] - arr[i]) == 1) {
				temp_array[j++] = arr[i];
				temp = arr[i + 1];
			}

		}
		temp_array[j++] = temp;
		System.out.println();
		System.out.print("Longest consecutive sequence in an array is : ");
		for (int i = 0; i < j; i++) {
			System.out.print(temp_array[i] + " ");
		}

	}

}
