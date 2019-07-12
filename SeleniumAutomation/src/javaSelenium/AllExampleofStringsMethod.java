package javaSelenium;

public class AllExampleofStringsMethod {
	
	public static void uppercase_lowercase(){
	     String s="Santosh";  
	     System.out.println(s.toUpperCase());//SACHIN  
	     System.out.println(s.toLowerCase());//sachin  
	     System.out.println(s);//Sachin(no change in original)
	}
	public static void trimming(){
		 String s=" Santosh Bihari Mohanty ";
		 System.out.println(s);
		 System.out.println(s.trim());
	}
	public static void valueOfMethod(){
		char a[]={'a','c','d','f'};
		String s=String.valueOf(a);
		System.out.println(s);
	}

	public static void main(String[] args) {
		//uppercase_lowercase();
		//AllExampleofStringsMethod.trimming();
		valueOfMethod();
		
	}

}
