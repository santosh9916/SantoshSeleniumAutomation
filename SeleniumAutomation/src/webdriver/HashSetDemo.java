package webdriver;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet a=new HashSet();
		a.add(10);
		a.add(10);
		a.add("Santosh");
		a.add("Mohanty");
		a.add(10.0f);
		a.add('5');
		a.add("Santosh");
		a.add("Mohanty");
		a.add('5');
		a.add(10.0f);
		System.out.println(a.size());
		System.out.println(a);
			
	}

}
