package CoreJava;

public class DoWhileExample {

	public static void main(String[] args) throws java.io.IOException {

		char choose;
		do {
			System.out.println("Choose one:");
			System.out.println("1.IF-ELSE");
			System.out.println("2.DO-WHILE");
			System.out.println("3.FOR");
			System.out.println("4.SWITCH");
			System.out.println("Choose a number from above :");
			choose = (char) System.in.read();//converting integer input to char
			break;//breaks the while condition if condition not matched and goes to the default condition
		} while (choose < '1' || choose > '4');
        

		System.out.println("----------");
		switch (choose) {
		case '1':
			System.out.println("IF-ELSE statement is exceuted");
			break;
		case '2':
			System.out.println("DO-WHILE statement is exceuted");
			break;
		case '3':
			System.out.println("FOR statement is exceuted");
			break;
		case '4':
			System.out.println("SWITCH statement is exceuted");
			break;
		default:
			System.out.println("No-loops are executed");
			break;

		}

	}

}
