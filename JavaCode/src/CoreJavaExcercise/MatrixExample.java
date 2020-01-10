package CoreJavaExcercise;

public class MatrixExample {

	public static void main(String[] args) {

		int[][] a = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] b = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] c = new int[3][3];

		// Adding two Matrices.
		System.out.println("ADD TWO MATRICES");
		System.out.println("-----------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		// Multiply two Matrices.
		System.out.println();
		System.out.println("MULTIPLY TWO MATRICES");
		System.out.println("-----------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		// Transposing a Matrix.
		System.out.println();
		System.out.println("TRANSPOSE MATRIX");
		System.out.println("------------------");
		int[][] transpose = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = a[j][i];
			}
		}
		System.out.println("Printing Matrix without transpose");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Printing Matrix after transpose");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

		// Subtracting two Matrices.
		System.out.println();
		System.out.println("SUBTRACT TWO MATRICES");
		System.out.println("----------------------");
		int[][] d = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		// Checking if a matrix is an identity matrix(contains 1,1,1 diagonally)
		System.out.println();
		System.out.println("IDENTITY MATRIX");
		System.out.println("-----------------");
		int[][] identity = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int rows, columns;
		boolean flag = true;
		rows = identity.length;
		columns = identity[0].length;
		if (rows != columns) {
			System.out.println("Matrix shouls be a square matrix.");
		} else {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (i == j && identity[i][j] != 1) {
						flag = false;
						break;
					}
					if (i != j && identity[i][j] == 1) {
						flag = false;
						break;
					}
				}
			}

		}
		if (flag) {
			System.out.println("Matrix is identity matrix.");
		} else {
			System.out.println("Matrix is not identity matrix.");
		}

		// Checking if the matrix is Sparse Matrix(maximum element in matrix are 0)
		System.out.println();
		System.out.println("SPARSE MATRIX");
		System.out.println("----------------");
		int count = 0;
		int size = (rows + columns) / 2;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (identity[i][j] == 0) {
					count++;
				}
			}
		}
		if (count > size) {
			System.out.println("Matrix is Sparse Matrix.");
		} else {
			System.out.println("Matrix is not a Sparse Matrix.");
		}

		// Checking if two matrices are equal.
		System.out.println();
		System.out.println("MATRIX ARE EQUAL");
		System.out.println("------------------");
		int row1, column1, row2, column2;
		row1 = a.length;
		column1 = a[0].length;
		row2 = b.length;
		column2 = b[0].length;
		if (row1 != row2 || column1 != column2) {
			System.out.println("Matrices are not equal.");
		} else {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column1; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
		}
		if (flag) {
			System.out.println("Matrices are equal.");
		} else {
			System.out.println("Matrices are not equal.");
		}

		// Converting a matrix to Lower Triangular Matrix.
		System.out.println();
		System.out.println("LOWER TRIANGULAR MATRIX");
		System.out.println("-------------------------");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				if (j > i) {
					System.out.print("0" + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}

		// Converting a matrix to Upper Triangular Matrix.
		System.out.println();
		System.out.println("UPPER TRIANGULAR MATRIX");
		System.out.println("------------------------");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				if (i > j) {
					System.out.print("0" + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}

		// Checking for odd and even number in a matrix.
		System.out.println();
		System.out.println("ODD AND EVEN NUMBER IN MATRIX");
		System.out.println("------------------------------");
		int countOdd = 0, countEven = 0;
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				if (a[i][j] % 2 == 0) {
					countEven++;
				} else {
					countOdd++;
				}
			}
		}
		System.out.println("Frequency of Odd Number : " + countOdd);
		System.out.println("Frequency of Even Number : " + countEven);

		// Calculating sum of each row and column.
		System.out.println();
		System.out.println("SUM OF EACH ROW AND COLUMN OF A MATRIX");
		System.out.println("---------------------------------------");
		for (int i = 0; i < row1; i++) {
			int sumRow = 0;
			for (int j = 0; j < column1; j++) {
				sumRow = sumRow + a[i][j];
			}
			System.out.println("Sum of " + (i + 1) + " row is : " + sumRow);
		}
		for (int i = 0; i < column1; i++) {
			int sumColumn = 0;
			for (int j = 0; j < row1; j++) {
				sumColumn = sumColumn + a[j][i];
			}
			System.out.println("Sum of " + (i + 1) + " column is : " + sumColumn);
		}
	}

}
