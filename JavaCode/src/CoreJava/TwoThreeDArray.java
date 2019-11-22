package CoreJava;

public class TwoThreeDArray {

	public static void main(String[] args) {
		
		//Two Dimensional Array
		int twoD[][] = new int[4][5];
		int i, j, k = 0;

		for (i = 0; i < 4; i++)
			for (j = 0; j < 5; j++) {

				twoD[i][j] = k;
				k++;
			}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++)

				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}

		System.out.println("===========");

		int twoD1[][] = new int[4][];

		twoD1[0] = new int[1];
		twoD1[1] = new int[2];
		twoD1[2] = new int[3];
		twoD1[3] = new int[4];

		int x, y, z = 0;

		for (x = 0; x < 4; x++)
			for (y = 0; y < x + 1; y++) {

				twoD1[x][y] = z;
				z++;
			}

		for (x = 0; x < 4; x++) {
			for (y = 0; y < x + 1; y++)

				System.out.print(twoD1[x][y] + " ");
			System.out.println();
		}

		System.out.println("===========");

		//Three Dimensional Array
		
		int threeD[][][] = new int[2][3][4];
		int d, e, f;

		for (d = 0; d < 2; d++)
			for (e = 0; e < 3; e++)
				for (f = 0; f < 4; f++)
					threeD[d][e][f] = d * e * f;

		for (d = 0; d < 2; d++) {
			for (e = 0; e < 3; e++) {
				for (f = 0; f < 4; f++)

					System.out.print(threeD[d][e][f] + " ");
				System.out.println();
			}
			System.out.println();
		}

	}
}
