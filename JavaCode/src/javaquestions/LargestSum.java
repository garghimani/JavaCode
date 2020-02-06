package javaquestions;

public class LargestSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int max = arr[0] + arr[1];
		int i, j;
		int num1 = arr[0], num2 = arr[1];

		// contiguous sub array within an array which has the largest sum
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) > max) {
					max = arr[i] + arr[j];
					num1 = arr[i];
					num2 = arr[j];
				}
			}
		}

		System.out.println("Sub Array which has largest sum is :{" + num1 + "," + num2 + "}");
		System.out.println("Sum is : " + max);

	}

}
