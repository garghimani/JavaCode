package CoreJava;

class ByReference{
	
	int i,j;
	
	ByReference(int a, int b){
		i = a; 
		j = b;
	}
	
	void refmeth(ByReference ob) {
		ob.i *= 2;
		ob.j /= 2;
	}
}

public class CallByReference {

	public static void main(String[] args) {
		
		ByReference br = new ByReference(15,50);
		
		System.out.println("Value of Method before passing value a :"+br.i+" b :"+br.j);
		
		br.refmeth(br);
		System.out.println("Value of Method after passing value a :"+br.i+" b :"+br.j);
	}

}
