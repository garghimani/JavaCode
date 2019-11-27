package CoreJavaExcercise;

public class StringBufferAndBuilder {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		
		//String Buffer appending all alphabets
		StringBuffer strbuffer = new StringBuffer("Alphabets StringBuffer : ");
		
        char []alphabet_string = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
        		'v','w','x','y','z'};
        
        strbuffer.append(alphabet_string);
        
        System.out.println(strbuffer);
        
        //String Builder appending all alphabets
        StringBuilder strbuilder = new StringBuilder("Alphabets String Builder : ");
        
        strbuilder.append(alphabet_string);
        System.out.println(strbuilder);


	}

}
