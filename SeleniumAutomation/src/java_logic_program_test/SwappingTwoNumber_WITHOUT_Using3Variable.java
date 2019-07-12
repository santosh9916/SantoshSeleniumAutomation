package java_logic_program_test;

public class SwappingTwoNumber_WITHOUT_Using3Variable {
	
	/*public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("After swap");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = " +a);
		
		System.out.println("b = " +b);
	}*/
	//REUSABLE METHODs
	public void swapping(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping value a="+a);
		System.out.println("Swapping value b="+b);
	}
	public static void main(String[] args) {
		SwappingTwoNumber_WITHOUT_Using3Variable swapp=new SwappingTwoNumber_WITHOUT_Using3Variable();
		swapp.swapping(10, 20);
	}
}
