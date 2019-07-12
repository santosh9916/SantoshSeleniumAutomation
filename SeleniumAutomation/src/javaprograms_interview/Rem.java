package javaprograms_interview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Rem {

	public static void main(String[] args) {
		String str[]={"ab","ab","ab","cd","ef","ef"};
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}
 
		System.out.println("My List : " + list);
		System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(list));
	}
 
	public static Set<String> findDuplicates(List<String> listContainingDuplicates) {
 
		final Set<String> setToReturn = new HashSet<String>();
		final Set<String> set1 = new HashSet<String>();
 
		for (String yourInt : listContainingDuplicates) {
			if (!set1.add(yourInt)) {
				//setToReturn.add(yourInt);
				System.out.println(add(yourInt));
			}
		}
		//return setToReturn;
		return set1;
	}
	

}
