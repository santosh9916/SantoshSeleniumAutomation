package java_logic_program_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Print_OnlyDuplicateValues_String {
	
	public static void printDuplicate(String str){
		 Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
	        char[] chrs = str.toCharArray();
	        for(Character ch:chrs){
	            if(dupMap.containsKey(ch)){
	                dupMap.put(ch, dupMap.get(ch)+1);
	            } else {
	                dupMap.put(ch, 1);
	            }
	        }
	        Set<Character> keys = dupMap.keySet();
	        for(Character ch:keys){
	            if(dupMap.get(ch) > 1){
	                System.out.println(ch+"--->"+dupMap.get(ch));
	            }
	        }
	    }
	public static void main(String[] args) {
		printDuplicate("abcadecfaa");
	} 
}
