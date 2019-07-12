package webdriver;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		
		
//Using HashMap we can take Both String value and int value
		
		HashMap hashMap=new HashMap();
	    hashMap.put(01, "Santosh");
	    hashMap.put("02", "Ramesh");
	    hashMap.put(03, "Sangamesh");
	    hashMap.put(04, "Santosh");
	    hashMap.put(05, "Ramesh");
	    hashMap.put(06, "Sangamesh");
	    System.out.println(hashMap);
	    
	    //see carefully below 2 different statements
	    
	    System.out.println(hashMap.get(01));
	    System.out.println(hashMap.get("02"));
	}

}
//Conclusion:-

