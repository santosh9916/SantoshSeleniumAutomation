package java_logic_program_test;

public class ReverseStringSentence {
	public static void m1(String str){
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	public static void m2(String str){
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}
    public static void m5(String str){
	   
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}	
	}
	public static void m3(String str){
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
			
		}
	}
	public static void m4(String str){
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
	}	
		public static void m6 (String str){	

		String[] str1 = str.split(" ");
		 for (int j = str1.length-1; j >=0 ; j--) {
			System.out.print(str1[i]+" ");
			
			}	
		}
	


	public static void main(String[] args) {
		//m1("SANTOSH MOHANTY");
		//m2("SASMITA MOHANTY");
		//m3("GAGAN MOHANTY");
		m4("GAGAN BIHARI MOHANTY");
       // m5("SAROJ BIHARI MOHANTY");
		
	}

}
