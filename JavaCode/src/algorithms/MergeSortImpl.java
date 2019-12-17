package algorithms;

import java.util.*;

public class MergeSortImpl {

	@SuppressWarnings("rawtypes")
	public static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
		// Index position in First Array - First Element
		int iFirst = 0;

		// Index position in Second Array - First Element
		int iSecond = 0;

		// Index position in Merged Array - First Element
		int iMerged = 0;

		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst].compareTo(second[iSecond]) < 0) {
				result[iMerged] = first[iFirst];
				iFirst++;
			} else {
				result[iMerged] = second[iSecond];
				iSecond++;
			}
			iMerged++;
		}

		System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
		System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
	}

	@SuppressWarnings("rawtypes")
	public static Comparable[] mergeSort(Comparable[] list) {
		if (list.length <= 1) {
			return list;
		}

		Comparable[] first = new Comparable[list.length / 2];
		Comparable[] second = new Comparable[list.length - first.length];

		System.arraycopy(list, 0, first, 0, first.length);
		System.arraycopy(list, first.length, second, 0, second.length);

		mergeSort(first);
		mergeSort(second);

		merge(first, second, list);
		return list;
	}

	public static void main(String[] args) {

		Integer[] arr = { 2, 6, 3, 5, 1 };

		System.out.print("Input Array : [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		mergeSort(arr);
		System.out.println("Sorted Array : " + Arrays.deepToString(arr));

	}

}
