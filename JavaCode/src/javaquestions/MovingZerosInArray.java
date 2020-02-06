package javaquestions;

import java.util.Arrays;

public class MovingZerosInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 4, 0, 8, 0, 2 };

		// Moving all zeros at the end of an array
		int[] new_arr = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				new_arr[k++] = arr[i];
			}
		}

		System.out.println("Moving all the zeros at the end of array : ");
		for (int i = 0; i < new_arr.length; i++) {
			arr[i] = new_arr[i];
			System.out.print(arr[i] + " ");
		}

	}

}
