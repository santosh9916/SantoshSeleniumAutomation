package java_logic_program_test;

public class ReverseStringWord {
	
	public static void wordReverseMETHOD1(String str){
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	public static void wordReverseMETHOD2(String str){
		
		StringBuilder sb=new StringBuilder(str.toUpperCase());
		System.out.println(sb.reverse());
	}
	public static void wordReverseMETHOD3(String str)
	{
		char[] ch = str.toCharArray();
		for(int i = ch.length-1;   i>=0;    i--)
		{
			System.out.print(ch[i]);
		}
	}
	public static void wordReverseMETHOD4(String str)
	{
		for (int i = str.length()-1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {

		/*wordReverseMETHOD1("SANTOSH");
		wordReverseMETHOD2("santosh");
		wordReverseMETHOD3("MOHANTY");*/
		wordReverseMETHOD4("HEMALATA");
				
	}

}
