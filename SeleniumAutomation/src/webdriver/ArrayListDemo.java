package webdriver;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(10);
		a.add(0, 5);
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
