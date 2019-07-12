package javaprogramsusingcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
	
	public void findDuplicateStringWord(String str){
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] str1 = str.split(" ");
		for(String s : str1){
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}			
		}
		Set<String> keys = map.keySet();
		for(String s : keys){
			if (map.get(s) > 1) {
				System.out.println(s+"-----"+map.get(s));
			}
		}
			
	}

	public static void main(String[] args) {
		DuplicateString dup=new DuplicateString();
		dup.findDuplicateStringWord("aaa aaa bb ccc dd ccc e");

	}

}
