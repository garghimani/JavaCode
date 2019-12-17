package algorithms;

import java.util.Arrays;

public class SelectionSortImpl {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void selectionSort(Object[] arr, int fromIndex, int toIndex) {
		Object d;
		for (int currentIndex = fromIndex; currentIndex < toIndex; currentIndex++) {
			int indexToMove = currentIndex;
			for (int tempIndexInLoop = currentIndex + 1; tempIndexInLoop < toIndex; tempIndexInLoop++) {
				// System.out.println(indexToMove+" "+tempIndexInLoop +" "+currentIndex);
				if (((Comparable) arr[indexToMove]).compareTo(arr[tempIndexInLoop]) > 0) {
					// System.out.println(indexToMove+" "+tempIndexInLoop +" "+currentIndex);
					// System.out.println();
					indexToMove = tempIndexInLoop;
				}
			}
			d = arr[currentIndex];
			arr[currentIndex] = arr[indexToMove];
			arr[indexToMove] = d;
		}

	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
		selectionSort(array, 0, array.length);
		System.out.println(Arrays.toString(array));
	}

}
