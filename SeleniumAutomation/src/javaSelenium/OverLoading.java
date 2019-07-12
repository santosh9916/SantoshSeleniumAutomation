package javaSelenium;

public class OverLoading {

	     public static void m1(int b,String a)
	     {
	      System.out.println("String");    
	     }
	     public static void m1(String a,int b)
	     {
	      System.out.println("s");
	     }
	     
	     public static void main (String []   args) {
	          /* m1(null);             // s
	           m1(null, null);*/       //String
	           
	     }
}
