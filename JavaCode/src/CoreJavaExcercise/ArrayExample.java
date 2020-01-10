package CoreJavaExcercise;

public class ArrayExample {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = new int[arr1.length];

		// Copying one array to another
		System.out.println("COPYING ONE ARRAY TO ANOTHER");
		System.out.println("-----------------------------");
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("Elements of original array..");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();
		System.out.println("Elements of new array..");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println();

		// Frequency of element in an array
		int[] fr = new int[arr1.length];
		System.out.println("FREQUENCY OF ELEMENT IN ARRAY");
		System.out.println("------------------------------");
		int visited = -1;
		for (int i = 0; i < arr1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited) {
				fr[i] = count;
			}
		}
		System.out.println("ELEMENT  | FREQUENCY");
		System.out.println("-------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr1[i] + "    |    " + fr[i]);
		}

		// Rotate Left the array
		System.out.println();
		System.out.println("ROTATING THE ARRAY");
		System.out.println("----------------------");

		System.out.println("Original Array..");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("LEFT ROTATE");
		System.out.println("-------------");
		int shift = 3;
		for (int i = 0; i < shift; i++) {
			int j, first;
			first = arr1[0];
			for (j = 0; j < arr1.length - 1; j++) {
				arr1[j] = arr1[j + 1];
			}
			arr1[j] = first;
		}
		System.out.println("Array after left rotation..");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		// Rotate right the array
		System.out.println();
		System.out.println();
		System.out.println("RIGHT ROTATE");
		System.out.println("------------");
		System.out.println("Original Array..");
		for (int i1 = 0; i1 < arr1.length; i1++) {
			System.out.print(arr1[i1] + " ");
		}
		int n = 2;
		for (int i = 0; i < n; i++) {
			int j, last;
			last = arr1[arr1.length - 1];
			for (j = arr1.length - 1; j > 0; j--) {
				arr1[j] = arr1[j - 1];

			}
			arr1[0] = last;
		}
		System.out.println();
		System.out.println("Array after right rotation..");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		// Checking for duplicate elements in an array.
		System.out.println();
		System.out.println();
		System.out.println("DUPLICATES ELEMENTS IN ARRAY");
		System.out.println("-----------------------------");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}

		// Printing elements of array in reverse order.
		System.out.println();
		System.out.println("ELEMENTS OF ARRAY IN REVERSE ORDER");
		System.out.println("------------------------------------");
		System.out.println("Original array....");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse array...");
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.print(arr1[i] + " ");
		}

		// Checking for elements present on even position.
		System.out.println();
		System.out.println();
		System.out.println("ELEMENTS ON EVEN POSITION");
		System.out.println("---------------------------");
		for (int i = 0; i < arr1.length; i = i + 2) {
			System.out.print(arr1[i] + " ");
		}

		// Checking for elements present on odd position.
		System.out.println();
		System.out.println();
		System.out.println("ELEMENTS ON ODD POSITION");
		System.out.println("---------------------------");
		for (int i = 1; i < arr1.length; i = i + 2) {
			System.out.print(arr1[i] + " ");
		}

		// Checking for largest element in an array.
		System.out.println();
		System.out.println();
		System.out.println("LARGEST ELEMENT IN ARRAY");
		System.out.println("--------------------------");
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		System.out.println("Largest element present in array : " + max);

		// Checking for smallest element.
		System.out.println();
		System.out.println("SMALLEST ELEMENT IN ARRAY");
		System.out.println("--------------------------");
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.println("Smallest element present in array : " + min);

		// Calculating length of an array.
		System.out.println();
		System.out.println("NUMBER OF ELEMENTS IN ARRAY");
		System.out.println("----------------------------");
		System.out.println("Total elements in array : " + arr1.length);

		// Calculating sum of elements in an array.
		System.out.println();
		System.out.println("SUM OF ELEMENTS OF ARRAY");
		System.out.println("--------------------------");
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println("Sum of elements : " + sum);

		// Arranging elements in ascending order.
		System.out.println();
		System.out.println("ARRAY IN ASCENDING ORDER");
		System.out.println("--------------------------");
		System.out.println("Original Array...");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		int temp = 0;
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}

		System.out.println("Elements in ascending order.");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		// Removing duplicate elements from the array.
		System.out.println();
		System.out.println("REMOVING DUPLICATE ELEMENTS");
		System.out.println("----------------------------");
		int[] temp_array = new int[arr1.length];
		int j1 = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			if (arr1[i] != arr1[i + 1]) {
				temp_array[j1++] = arr1[i];
			}
		}
		temp_array[j1++] = arr1[arr1.length - 1];

		for (int i = 0; i < j1; i++) {
			arr1[i] = temp_array[i];
		}
		System.out.println("Array after removing duplicate elements....");
		for (int i = 0; i < j1; i++) {
			System.out.print(arr1[i] + " ");
		}

		// Checking for the third largest number.
		System.out.println();
		System.out.println("THIRD LARGEST NUMBER IN ARRAY");
		System.out.println("------------------------------");
		System.out.println("Third largest number in array is : " + (arr1[arr1.length - 3]));

		// Arranging elements in descending order.
		System.out.println();
		System.out.println("ARRAY IN DESCENDING ORDER");
		System.out.println("---------------------------");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] < arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		System.out.println("Elements in descending order.");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		// Check for odd and even number in an array.
		System.out.println();
		System.out.println("ODD AND EVEN NUMBER");
		System.out.println("---------------------");
		System.out.println("Odd Number..");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 != 0) {
				System.out.println(arr1[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Even Number..");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				System.out.println(arr1[i] + " ");
			}
		}

		System.out.println();

	}

}
