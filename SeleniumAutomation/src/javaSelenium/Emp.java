package javaSelenium;

public class Emp {
	 int emp_id;
	 String emp_name;

		Emp(int id, String name){
			emp_id=id;emp_name=name;
			
		}
		 
		public String toString(){
			return "["+emp_id+"  "+emp_name+"]";
		}
		public boolean equals(Object o){
			Emp x=(Emp)o;
			boolean s=(emp_id==x.emp_id && emp_name==x.emp_name);
			return s;
		}
		
		public static void main(String[] args) 
		{
			int a=10;
			int b=10;
			Emp e1=new Emp(01,"Sagar");
			Emp e2=new Emp(01,"Sagar");
		
			System.out.println(e1.equals(e2));
		}

}
