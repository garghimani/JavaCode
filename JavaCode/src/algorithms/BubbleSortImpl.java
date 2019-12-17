package algorithms;

import java.util.Arrays;

public class BubbleSortImpl {

	@SuppressWarnings({"unchecked", "rawtypes" })
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

	public static void main(String[] args) {
		Integer[] array = new Integer[] {12, 13, 24, 10, 3, 6, 90, 70};
		bubbleSort(array, 0, array.length);
		System.out.println(Arrays.toString(array));
	}
}
