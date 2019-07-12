package javaprograms_interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class EmployiesDetails {
	String name;
	String dept;
	int age;
	EmployiesDetails(String name,String dept,int age){
		this.name=name;
		this.dept=dept;
		this.age=age;
		
	}
}
	class NameComparator implements Comparator<EmployiesDetails>{
		public int compare(EmployiesDetails emp1,EmployiesDetails emp2){
			return emp1.name.compareTo(emp2.name);
		}
	}
	
	class DepartmentComparator implements Comparator<EmployiesDetails>{
		public int compare(EmployiesDetails emp1,EmployiesDetails emp2){
			return emp1.dept.compareTo(emp2.dept);
		}
	}
	
	class AgeComparator implements Comparator<EmployiesDetails>{  
		public int compare(EmployiesDetails emp1,EmployiesDetails emp2){  
		if(emp1.age==emp2.age)  
		return 0;  
		else if(emp1.age>emp2.age)  
		return 1;  
		else  
		return -1;  
		}  
	} 
	
	public class Employee {

	public static void main(String[] args) {
		
		ArrayList<EmployiesDetails> al = new ArrayList<EmployiesDetails>();
		al.add(new EmployiesDetails("Santosh", "QA", 25));
		al.add(new EmployiesDetails("Rakesh", "Dev", 26));
		
		System.out.println("Sorting by name...");
		Collections.sort(al, new NameComparator());
		for(EmployiesDetails e:al){
			System.out.println(al.name+" "+al.dept+" "+al.age);
		}
		
		System.out.println("Sorting by department");
		Collections.sort(al, new DepartmentComparator());
		for(EmployiesDetails e:al){
			System.out.println(al.name+" "+al.dept+" "+al.age);
		}
		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator());
		for(EmployiesDetails e:al){
			System.out.println(al.name+" "+al.dept+" "+al.age);
		}
	
	}
}
