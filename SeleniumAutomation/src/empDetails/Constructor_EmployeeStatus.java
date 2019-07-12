package empDetails;

public class Constructor_EmployeeStatus extends Parent_Employee{
	static String empName;
    static int empId;
    static float empSal;
    static String empAddr;


public Constructor_EmployeeStatus(String empName,int empId,float empSal,String empAddr,String empDesignation)
{
	this.empName=empName;
	this.empId=empId;
	this.empSal=empSal;
	this.empAddr=empAddr;
	super.empDesignation=empDesignation;
	System.out.println(empName+empId+empSal+empAddr);
}
public static void main(String[] args) {
	//Constructor_EmployeeStatus cEmployee=new Constructor_EmployeeStatus(empName, empId, empSal, empAddr);
	Constructor_EmployeeStatus cEmployee1=new Constructor_EmployeeStatus("ABC", 001, 50.5f, "BBSR","QA");
	
	/*System.out.println(cEmployee.empName="Santosh");
	System.out.println(cEmployee.empId=102);
	System.out.println(cEmployee.empSal=5000.0f);
	System.out.println(cEmployee.empAddr="Ameerpet");
	System.out.println(cEmployee.empDesignation="Test Engineer");
	System.out.println("------------------------------");
	System.out.println(cEmployee.empName="Deva");
	System.out.println(cEmployee.empId=103);
	System.out.println(cEmployee.empSal=60000.0f);
	System.out.println(cEmployee.empAddr="SRnagar");
	System.out.println(cEmployee.empDesignation="Software Engineer");*/
	
}
}
