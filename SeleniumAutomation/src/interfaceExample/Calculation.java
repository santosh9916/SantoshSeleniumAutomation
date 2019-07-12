package interfaceExample;

 interface Calculation {
	
	
	void calculate();
}
class Addition implements Calculation{
	public void calculate(){
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("Addition values"+c);
	}
}
class Subtraction implements Calculation{
	public void calculate(){
		int a=10;
		int b=20;
		int c= b-a;
		System.out.println("Subtraction values are"+c);
	}
}
class TestInterface{
	public static void main(String[] args) {
		Calculation cal= new Addition();
		cal.calculate();
			
			
	}
}
