package javaprograms_interview;

public class SearchParameterFromItArray_6 {
	
	public static void m1(){
		String str="Ram Rahul Raka Litu plus santu";       String searchparameter="Plus";
		String s[]=str.split(" ");
		for (int i = 0; i < s.length; i++) {
			//String str1 = s[i].toString();
			//System.out.println(str1);
		if (s[i].equalsIgnoreCase(searchparameter)) {
			System.out.println(s[i]);
		}	}
			
	}
	public static void m3(){
		String str="Ram Rahul Raka Litu plus santu"; 
		String[] str1=str.split(" ");
		String searchparameter="plus";
		
		for (int i = 0; i < str1.length; i++) {
			
			if (str1[i].equals(searchparameter)) {
				
				System.out.println(str1[i]);
			}
		}
	}
	public static void m2(int searchparameter){
		int n[]={1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < n.length; i++) {
			if (n[i]==searchparameter) {
				i++;
				System.out.println(i+ ": Number available");
			} 
		}
		
	}

	public static void main(String[] args) {
		m1();
		//m2(5);
		m3();

	}

}
