package webdriver;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList a=new LinkedList();
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
		//Suppose i want to 5no data
	    a.remove(3);
	    System.out.println(a);
	    System.out.println(a.size());
	
	}
}
