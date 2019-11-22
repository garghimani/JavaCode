package CoreJava;

public class JumpStatementExample {

	public static void main(String[] args) {
		int i, j;
		 boolean a = true;
		 System.out.println("The value of a is :" + a);

		for (i = 0; i <= 10; i++) {

			System.out.println("The value of i is :" + i);
			if (i % 2 == 0)
				continue; // if value of i is 0 then the control goes back to first for loop for(i)
			outer: {
                
				for (j = 0; j <= 10; j++) {

					System.out.println("The value of j is :" + j);
					if (j > i) {
						System.out.println("------");
						break outer; // if j<i then the control goes to the first for loop for(i)
					}

					  if (a) break; return; // the inner loop is not called again if a is true
					 
				}

			}
		}
	}

}
