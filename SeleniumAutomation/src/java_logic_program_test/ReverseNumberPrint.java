package java_logic_program_test;

public class ReverseNumberPrint {
	
	//REUSABLE METHODs
    public void reverse(int num) {
		int reversenum=0;
		while (num != 0) {
			reversenum =  num%10;
			num = num/10;
			System.out.println("Reverse of specified number is:"+reversenum);
		}
     }
 

    public static void main(String[] args) {
		ReverseNumberPrint rev=new ReverseNumberPrint();
		rev.reverse(1234);
	}
}
