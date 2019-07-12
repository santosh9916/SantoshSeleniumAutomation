package java_logic_program_test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removing_Duplicates_From_Array {
	public static void main(String[] args) {
		
		
//Remove duplicates from an array integer value	
		int a[] = {0,1,2,0,1,2,3,4,6};
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(0);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(0);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(6);
		System.out.println(hashSet);

		
		
//Remove duplicates from an array String value  
		String[] name={"SAANTOTSOH"};
		ArrayList<String> name1=new ArrayList<String>();
		name1.add("S");
		name1.add("A");
		name1.add("A");
		name1.add("N");
		name1.add("T");
		name1.add("O");
		name1.add("T");
		name1.add("S");
		name1.add("O");
		name1.add("H");
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<String>(name1);
		System.out.println(linkedhashset);
		
	}

}
