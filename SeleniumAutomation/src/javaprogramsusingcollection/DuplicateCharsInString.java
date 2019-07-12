package javaprogramsusingcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	
	public void findDplicateCharacters(String str){
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		char[] chrs = str.toCharArray();
		for(Character ch : chrs){
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}			
		}
		Set<Character> keys = map.keySet();
		for(Character ch : keys){
			if (map.get(ch)>1) {
				System.out.println(ch+"------"+map.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		DuplicateCharsInString dup = new DuplicateCharsInString();
		dup.findDplicateCharacters("concentration");

	}

}
