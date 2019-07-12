package java_logic_program_test;

public class OccurrencesInWORDArray {

	public static void main(String[] args) {
		int charCount = 0;
		String myBuffer="Cat can kill mouse but mouse can not kill cat";
		String s = String.valueOf(myBuffer);
		String[] array = s.split(" ");
		for (int i = 0; i < array.length; i++) {
		    if(array[i].equals("cat")){
		        
				charCount++;
				
		    }
		    System.out.println(charCount);
		}

	}

}
