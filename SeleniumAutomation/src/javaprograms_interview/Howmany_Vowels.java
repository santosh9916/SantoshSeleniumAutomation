package javaprograms_interview;

public class Howmany_Vowels {
	public static void vowels(){
		String str="Concentration";
		int count = 0;
		String str1=str.toLowerCase();
		for (int i = 0; i < str1.length(); i++) {
			char ch=str1.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				System.out.print(count);//to check how many vowels available
				System.out.println(ch);//to print which vowel available
			}
		}
	}
	
	public static void numberOfConsonants(){
		String str="Concentration";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if (c=='a' || c=='e' ||c=='i' || c=='o' || c=='u') {
				count++;
				//System.out.println(c);
			}
			int in=str.length()-count;
			System.out.println(in);
	}
	}
	public static void printConsonants(){
		String str="Concentration";
		int count=0; 
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u') {
				count++;
				System.out.print(c);
				System.out.println(count);
			}
		}
	}

	public static void main(String[] args) {
		vowels();
		//numberOfConsonants();
		//printConsonants();

	}

}
