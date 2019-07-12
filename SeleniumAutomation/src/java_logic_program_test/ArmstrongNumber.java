package java_logic_program_test;

public class ArmstrongNumber {
	
	public void method1(int num) {
		int temp=num, rem, sum=0;
		while(temp!=0){
			rem=temp%10;
			System.out.println(sum=sum+(rem*rem*rem));
			temp=temp/10;
			
		}
		if (num==sum) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}		
	}
	public void method2(int num) {
		int temp=num; 
		String str=temp+"";
		int length = str.length();
		int sum=0;	int rem;	
		
		while(temp>0)
		{
			rem = num%10;
			sum = sum + (int) Math.pow(rem, length);
			num = num/10;
			
		}
		if (num==sum) {
			System.out.println(sum + "is armstrong");
		}else {
			System.out.println(sum +"is not armstrong");
		}
		
	}
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		armstrongNumber.method1(153);
		armstrongNumber.method2(1634);
	}

}
