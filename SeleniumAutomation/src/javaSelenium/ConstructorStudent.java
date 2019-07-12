package javaSelenium;

public class ConstructorStudent {
	int id;  
	String name;  
	  
	public ConstructorStudent(int i, String n) {
		id = i;
		name=n;
		System.out.println(id+"  "+name);
	}
	void display()
	{
		System.out.println(id+" "+name);
	}  	 
	
	public static void main(String[] args) {
		ConstructorStudent s0=new ConstructorStudent(7,"Ram");
		ConstructorStudent s1=new ConstructorStudent(8,"Hari");  
		ConstructorStudent s2=new ConstructorStudent(9,"KRISNA");  
			 s0.display(); 
			 s1.display();  
			 s2.display();
			} 

	}


