package javaquestions;

public class SumOfArray {

	int[] arr = { 1, 2, 3, 4, 5, 6 };

	// Find two numbers that they add to a specific target number
	void addNumber(int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("The numbers are : " + arr[i] + " " + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {

		SumOfArray sum = new SumOfArray();
		sum.addNumber(4);

	}

}
