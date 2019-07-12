package java_logic_program_test;

public class String_PalindromValue {
	
	
//USING reverse method
	public void reverseStringMethod1(String str) {

		StringBuffer stringBuffer=new StringBuffer(str);
		StringBuffer str1 = stringBuffer.reverse();
		System.out.println(str);
		System.out.println(str1);
		if (str.equals(str1.toString())) {
			System.out.println("It is palindome");
		}else {
			System.out.println("It is not palindrome");
		}System.out.println("---------------------------");
	}
	
	
//Without using reverse method 
	public void reverseStringMethod2(String str) {
		//String str="abcba";
		String str2 = "";
		for (int i = str.length()-1; i >= 0 ; i--) {
			str2 = str2+str.charAt(i);
			System.out.println(str2);
		}
		if (str.equals(str2)) {
	    	System.out.println("String value is Palindrome");
	    }else {
			System.out.println("String value not palindrome");
	      }	  
	}
	
	public static void main(String[] args) {
		String_PalindromValue string_PalindromValue=new String_PalindromValue();
		
		//string_PalindromValue.reverseStringMethod1("abcba");
		
		string_PalindromValue.reverseStringMethod2("abcba");
		
		}

}
