package javaSelenium;

 class  sim1{
	static void m1(int a){
		System.out.println("h");
	}
	static void m1(String str){
    	System.out.println("hiiiiiiiii");
		
	}
}
	class sim2 extends sim1{
		static void m1(int a){
			System.out.println("hi");
		}
	    static void m1(String str){
			System.out.println("hello");
		}
}
public class simplecl extends sim2{
	public static void main(String[] args) {
		m1("sh");
		

	}

}
