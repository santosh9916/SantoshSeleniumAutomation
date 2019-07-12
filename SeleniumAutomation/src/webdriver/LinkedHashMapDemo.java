package webdriver;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
     public static void main(String[] args) {
		LinkedHashMap linkedHashMap=new LinkedHashMap();
		linkedHashMap.put(01, "Santosh");
	    linkedHashMap.put("02", "Ramesh");
	    linkedHashMap.put(01, "Sangamesh");
	    linkedHashMap.put(04, "Santosh");
	    linkedHashMap.put(05, "Ramesh");
	    linkedHashMap.put(06, "Sangamesh");
	    System.out.println(linkedHashMap);
	     //see carefully below 2 different statements
	    
	    System.out.println(linkedHashMap.get(01));
	    System.out.println(linkedHashMap.get("02"));
	}
}
