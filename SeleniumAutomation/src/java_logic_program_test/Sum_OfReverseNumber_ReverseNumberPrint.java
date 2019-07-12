package java_logic_program_test;

public class Sum_OfReverseNumber_ReverseNumberPrint {
	 public void reverse(int num) {
		    int sum=0;
			int reversenum=0;
			while (num != 0) {
				reversenum =  num%10;
				sum=sum+reversenum;
				num = num/10;
				System.out.println("Reverse of specified number is:"+reversenum);
				System.out.println(sum);
			}
	     }
	    public static void main(String[] args) {
			Sum_OfReverseNumber_ReverseNumberPrint rev=new Sum_OfReverseNumber_ReverseNumberPrint();
			rev.reverse(1234);
		}
	}


