package aaa_Common_Questions;

//What is the difference between == and equals

// == is relational operators used to compare value
// .equal is a method used to compare between two reference. 
public class CompareValue {
	public static void main(String[] args) {
		//What is the difference between == and equals
		// == is relational operators used to compare value
		// .equal is a method used to compare between two reference. 
		
		// == Operations
		String a1 = "Khosruz";
		String a2 = "Khosruz";
		boolean a3 = (a1 == a2);
		System.out.println("Result of = = Operator : "+a3);
		
		// .equals() Operations
		String str1 = new String("Khosruz");
		String str2 = new String(str1);
		boolean str3 = (str1.equals(str2));
		System.out.println("Result of  .equals() Operator : "+str3);
	}

}
