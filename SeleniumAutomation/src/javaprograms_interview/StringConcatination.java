package javaprograms_interview;

public class StringConcatination {
	public static void m1(String str1,String str2){
		System.out.println(str1+" "+str2);
	}
	public static void m2(){
		//String str="Android Mobile is good";
		String str=new String("Android Mobile is good");
		str.concat("  as compaired to Windows");
		System.out.println(str);
	}
	public static void m3(){
		StringBuilder sb=new StringBuilder("Android Mobile is good");
		sb.append(" as compaired to Windows");
		System.out.println(sb);
	}

	public static void main(String[] args) {
		m1("Hellow", "Sweety");
		m2();
		m3();

	}

}
