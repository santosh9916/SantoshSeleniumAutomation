package javaprograms_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateValuesFromArray {
	
	public static void m0() {
		int[] n = { 1, 1, 2, 3, 4, 4 };
		for (int i = 0; i < n.length; i++) {
			// System.out.println(n[i]);
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == n[j]) {
					System.out.println(n[i]);
					// i+=1;
				}
			}
		}
	}

	public static void m1() {
		int[] n = { 1, 1, 1, 2, 3, 4, 4 };
		for (int i = 0; i < n.length; i++) {
			// System.out.println(n[i]);
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == n[j]) {
					System.out.println(n[i]);
					// i+=1;
				}
			}
		}
	}

	public static void m2() {
		int[] num = { 1, 1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 9, 9, 8, 8, 8 };
		Arrays.sort(num);
		for (int i = 1; i < num.length; i++) {
			// System.out.println(num[i]);
			if (num[i - 1] == num[i]) {
				System.out.println(num[i]);
				i += 2;
			}
			/*
			 * for (int j = i+1; j < num.length; j++) { if (num[i]==num[j]) {
			 * System.out.println(num[i]); i+=1;
			 */
		}
	}

	public static void m3() {
		String[] str = { "abc", "abc", "xyz", "mno", "mno" };
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[i]);

				}
			}
		}
	}

	public static void m4() {
		String[] str = { "abc", "abc", "xyz", "abc", "mno", "mno", "mno" };
		for (int i = 1; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[i]);
					i += 2;
				}
			}
		}
	}

	public static void m5() {
		String str = "Iwnewtervitew";
		// char[] c = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
				{
					count++;
					//System.out.println(str.charAt(i));
					
				if (count > 1)
				{
					System.out.println(str.charAt(i));	
				
				}
				
				}
			}
		}
	}

	public static void m6() {
		String s = "abcabd";
		char[] c = s.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
				if (count == 2) {
					System.out.println(c);
				}
			}
		}
	}

	public static void main(String[] args) {
		// m0();
		// m1();
		// m2();
		// m3();
		// m4();
		m5();
		//m6();
	}

}
