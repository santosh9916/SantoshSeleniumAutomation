package java_logic_program_test;

public class PrimeNumberProgram {
	
// Prime number is a number who is divisible by 1 or itself i,e 2,3,5,7,11,17.......
	
	
// To check Given Number is prime number or not
	public static void m1(int num) {
		int flag = 0;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num + "  <---- is not a prime Number");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(num + "  <---- is a prime Number");
		}

	}
// To find out prime number upto given number	
	public static void m2(int num){
		int flag=0;
		for (int i = 1; i <= num; i++)
		{
			for (int j = 2; j < num/2; j++)
			{
				if (num % j == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag==0) {
				System.out.println("Prime numbers are ::::"+num);
			}
		}
		
	}

	public static void main(String[] args) {

		//m1(9);
		m2(100);

	}

}
