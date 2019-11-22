package CoreJava;

class ObjectParameter{
	
	int a,b;
	
	ObjectParameter(int x, int y){
		
		a=x;
		b=y;
	}
		
		boolean equalTo(ObjectParameter o) {
			if(o.a == a && o.b == b) return true;
			else return false;
	}
	
}

public class ObjectAsParameterSample {

	public static void main(String[] args) {
		ObjectParameter ob1 = new ObjectParameter(10,20);
		ObjectParameter ob2 = new ObjectParameter(10,20);
		ObjectParameter ob3 = new ObjectParameter(-1,-1);
		
		System.out.println("ob1 == ob2 :" + ob1.equalTo(ob2));
		System.out.println("ob1 == ob3 :" + ob1.equalTo(ob3));
	}

}
