package javaSelenium;

public class EmployeeDetails {
	int id;
	String name, addr, dept,mobNum;
	
	EmployeeDetails(int id,String name,String mobNum,String addr,String dept){
		System.out.println(id+" "+name+" "+mobNum+" "+addr+" "+dept);
	}
	
	public static void main(String[] args) {
		EmployeeDetails emp1=new EmployeeDetails(01,"Santosh","9439688185", "Marathali", "Testing");
		EmployeeDetails emp2 =new EmployeeDetails(02, "Kalu", "9436258755", "Karepuram", "JavaDevloper");
	}
	

}
