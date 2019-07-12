package javaprogram_Piramid;

public class Triangle_Code {
	


	
	public static void drawPyramidPattern(){
		
//      Print * in triangle
//                          * 
//                         * *
//                        * * *
//                       * * * *
//                      * * * * * 
		
		int n=5;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//  Print * in triangle
//                        * 
//                        * *
//                        * * *
//                        * * * *
//                        * * * * * 
	public static void drawPyramidPattern2(){
		int n=5;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
//  Print * in triangle
//                        * 
//                        * *
//                        * * *
//                        * * * *
//                        * * * * * 
	public static void drawPyramidPattern3(){
		StringBuilder sb = new StringBuilder();
		String sep = "";
		for (int i=0; i< 5; i++) {
		System.out.println( sb.append(sep).append("*") );
		sep = " ";
		}

		
	}
	
	public static void drawPyramidNumbersMethod1(){
		
//  Print numbers in triangle
//      1
//      1 2
//      1 2 3
//      1 2 3 4
//      1 2 3 4 5
		
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j <= 6-i; j++)
			{
				System.out.print("");
			}
			for (int k = 1; k < i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
	
	public static void drawPyramidNumbersMethod2(){
//  Print numbers in triangle
//                                  1
//                                 1 2
//                                1 2 3
//                               1 2 3 4
//                              1 2 3 4 5
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 0; j < 5 - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
//		Triangle_Code.drawPyramidPattern();
//		Triangle_Code.drawPyramidPattern2();
//		Triangle_Code.drawPyramidPattern3();
//		Triangle_Code.drawPyramidNumbersMethod1();
		Triangle_Code.drawPyramidNumbersMethod2();

	}

}
