package javaprogramsusingcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateNumbers {
	int[] num={1,1,1,1,2,3,3,3,1};
	public void findDuplicateNumbers(){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer integer : num){
			if (map.containsKey(integer)) {
				map.put(integer, map.get(integer)+1);
			}else {
				map.put(integer, 1);
			}			
		}
		Set<Integer> set = map.keySet();
		for(Integer integer : set){
			if(map.get(integer)>1){
			System.out.println(integer+"-----"+map.get(integer));
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumbers dup = new DuplicateNumbers();
		dup.findDuplicateNumbers();

	}

}
