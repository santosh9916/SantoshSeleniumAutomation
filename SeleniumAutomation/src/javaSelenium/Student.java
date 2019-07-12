package javaSelenium;

public class Student {

	int id;  
    String name;
    String branch;
      
    Student(int i,String n,String b){  
    id = i;  
    name = n;
    branch=b;
    }  
    
	void display(){
    	System.out.println(id+" "+name+" "+branch);
    }  
   
    public static void main(String args[]){  
    Student s1 = new Student(111,"Karan","ETC");  
    Student s2 = new Student(222,"Aryan","ELE");  
    s1.display();  
    s2.display(); 

	}

}
