package java_logic_program_test;

public class Factorial_Number {
	public static void factorial(int num) {
		int result=1;
		for (int i = 1; i <= num; i++) {
			result=result*i;
			System.out.println(result);
		}
	}
	public static void fact(int num){
		int result=1;
		int i=1;
		while(num>=i){
			result=result*i;
			System.out.println(result);
			i++;
		}
	}

	public static void main(String[] args) {
		//Factorial_Number fact=new Factorial_Number();
		//fact.factorial(5);
		Factorial_Number.factorial(5);
		Factorial_Number.fact(5);
	}

}
