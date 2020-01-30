package CoreJavaExcercise;

public class PatternExample {

	public static void main(String[] args) {
		/*
		 * Print the below pattern 
		 * 1 
		 * 2 4 
		 * 3 6 9 
		 * 4 8 12 16
		 */

		System.out.println("FIRST PATTERN");
		System.out.println("--------------");
		int i, j, lines = 10;
		for (i = 1; i <= lines; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}

	}

}
