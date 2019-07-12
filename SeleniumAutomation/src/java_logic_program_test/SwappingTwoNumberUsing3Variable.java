package java_logic_program_test;

/*public class SwappingTwoNumberUsing3Variable {
	static int a = 10;
	static int b = 20;
	static int temp;
	public static void main(String[] args) {
		temp=a+b;
		System.out.println(a=temp-a);
		System.out.println(b=temp-b);
	}
}*/

  //For reusable
class SwappingTwoNumberUsing3Variable{
	
	 public void m1(int a, int b) {
		int temp= a;
		a=b;
		b=temp;
		System.out.println("swap value is a="+a);
		System.out.println("swap value is b="+b);
	}
	public static void main(String[] args) {
		SwappingTwoNumberUsing3Variable swap=new SwappingTwoNumberUsing3Variable();
	    swap.m1(10, 20);
	    
	}
}
