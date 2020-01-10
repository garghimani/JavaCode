package algorithms;

import java.util.Arrays;

public class BubbleSortImpl {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void bubbleSort(Object[] arr, int fromIndex, int toIndex) {
		Object d;
		for (int i = toIndex - 1; i > fromIndex; i--) {
			boolean isSorted = true;
			for (int j = fromIndex; j < i; j++) {
				if (((Comparable) arr[j]).compareTo(arr[j + 1]) > 0) {
					isSorted = false;
					d = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = d;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}

	// Second Way of Bubble Sorting
	static void bubbleSort2(int[] array) {
		int length = array.length;
		int temp = 0;

		for (int a = 0; a < length; a++) {
			for (int b = 1; b < (length - a); b++) {
				if (array[b - 1] > array[b]) {
					temp = array[b - 1];
					array[b - 1] = array[b];
					array[b] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
		bubbleSort(array, 0, array.length);
		System.out.println(Arrays.toString(array));

		int array1[] = { 12, 13, 24, 10, 3, 6, 90, 70 };
		System.out.println("Array before Bubble Sort...");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		bubbleSort2(array1);
		System.out.println("Array after Bubble Sort..");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");

		}
	}
}
