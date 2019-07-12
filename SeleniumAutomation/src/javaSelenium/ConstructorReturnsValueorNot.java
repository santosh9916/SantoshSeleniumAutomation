package javaSelenium;

public class ConstructorReturnsValueorNot {
	
	int a, b;
	
	ConstructorReturnsValueorNot(int a, int b)
	{
		this.a=a;
		this.b=b;
		int c=a+b;
		System.out.println(c);
		return ;
		
	}

	public static void main(String[] args) {
		ConstructorReturnsValueorNot c = new ConstructorReturnsValueorNot(10, 20);
		ConstructorReturnsValueorNot c1 = new ConstructorReturnsValueorNot(30, 40);
		ConstructorReturnsValueorNot c2= new ConstructorReturnsValueorNot(50, 60);

	}

}
