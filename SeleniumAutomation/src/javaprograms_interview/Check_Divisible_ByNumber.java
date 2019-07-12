package javaprograms_interview;

import java.util.Scanner;

public class Check_Divisible_ByNumber {
	
	public static void m1(int num){
		int result;
		result=num%5;
		if (result==0) {
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}

	public  boolean m2(){
		
		Scanner in=new Scanner(System.in);  
	    System.out.println("Enter your Number");  
		int num=in.nextInt(); 
		
		if (num%7==0){ 
			return true;
		}else{
		    return false;
		}		
	}

	public static void main(String[] args) {
		m1(6);
		//Check_Divisible_ByNumber c=new Check_Divisible_ByNumber();
	

	}

}
