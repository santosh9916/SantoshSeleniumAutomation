package java_logic_program_test;
//Palindrome number in java: A palindrome number is a number that is same after reverse.
//example = 545, 153, 34543, 343, 171, 48984 are the palindrome numbers.
//
//Palindrome number algorithm

//Get the number to check for palindrome
//Hold the number in temporary variable
//Reverse the number
//Compare the temporary number with reversed number
//If both numbers are same, print "palindrome number"
//Else print "not palindrome number"
//Let's see the palindrome program in java. In this java program,
//                          we will get a number variable and check whether number is palindrome or not.
public class PalindromeNumber {
	
	public void method1(int num){
		int num1=0; int reversenum;
		int temp=num;
	    while(temp>0){    
		     reversenum=temp%10;  //getting remainder  
		     System.out.println(num1=(num1*10)+reversenum); 
		     temp=temp/10; 
		  }    
		  if(num==num1) {   
		   System.out.println("palindrome number is "+num1);    
		  }else{    
		   System.out.println("not palindrome number");
	      }
	}
	

	public static void main(String[] args) {
		   PalindromeNumber palindromeNumber=new PalindromeNumber();
		   palindromeNumber.method1(151);
		  	}
}
