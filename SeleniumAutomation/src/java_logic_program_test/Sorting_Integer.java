package java_logic_program_test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Sorting_Integer {
	
	
	
	public void method1()
	{
		int[] intarr={2,5,3,9,5,7,0};
		for(int number:intarr)
		{
			System.out.println("UnSorting Array is:"+number);
		}
		Arrays.sort(intarr);
		for(int number:intarr)
		{
			System.out.println("Sorting array is: "+number);
		}
	}
	
	public void method2()
	{            //ascending sorting order
		int[] numbers={0,2,5,3,9,5,7,100,10};
		int temp;
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = i+1; j < numbers.length; j++)
			{
				if (numbers[i] > numbers[j])//Just change less than( > ) symbol
				{
					temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
				System.out.println("Sorting Numbers is: " + Arrays.toString(numbers));
			}	
		}
		//System.out.println("Sorting Numbers is: " + Arrays.toString(numbers));
	}
	public void method3()
	{        //descending sorting order
		int[] numbers={0,2,5,3,9,5,7,100,10};
		int temp;
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = i+1; j < numbers.length; j++)
			{
				if (numbers[i] < numbers[j])//Just change less than( < ) symbol
				{
					temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;System.out.println("Sorting Numbers is: " + Arrays.toString(numbers));
				}
			}	
		}
		//System.out.println("Sorting Numbers is: " + Arrays.toString(numbers));
	}
	
	public void method4()
	{
		List<Integer> list=Arrays.asList(2,5,3,9,5,7,10);
		Collections.sort(list);
		System.out.println(list);
		//Remove duplicate
		Set<Integer> set=new HashSet<Integer>(list);
		System.out.println(set);
	}


	public static void main(String[] args) {
		Sorting_Integer ai=new Sorting_Integer();
		ai.method1();
		//ai.method2();
		//ai.method3();
		//ai.method4();
		

	}

}
