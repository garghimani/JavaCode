package algorithms;

import java.util.Arrays;

public class QuickSortImpl {
	
	public static void swap(Integer []arr, int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
	
	public static void quickSort(Integer []arr, int low, int high) {
		
		if(arr == null || arr.length == 0) {return;}
		if(low >=high) {return;}
		
		int middle = low + (high - low)/2;
		int pivot = arr[middle];
		
		int i =low;
		int j = high;
		
		while(i <= j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		if(low < j) {quickSort(arr, low, j);} 
		if(high > i) {quickSort(arr, i, high);}
	}

	public static void main(String[] args) {
		
		 // This is unsorted array
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
 
        // Let's sort using quick sort
        quickSort( array, 0, array.length - 1 );
 
        // Verify sorted array
        System.out.println(Arrays.toString(array));	
	}

}
