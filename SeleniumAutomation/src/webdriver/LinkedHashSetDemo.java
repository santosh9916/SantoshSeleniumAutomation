package webdriver;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet a=new LinkedHashSet();
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
		System.out.println(a);
		System.out.println(a.size());
	}

}
