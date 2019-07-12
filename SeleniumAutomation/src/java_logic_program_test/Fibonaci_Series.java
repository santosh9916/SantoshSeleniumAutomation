package java_logic_program_test;

public class Fibonaci_Series {

	public static void main(String[] args) {
		int prev, next, sum;
		prev=0;
		next=1;
		for (int i = 0; i<=5; i++) {
			System.out.println(prev);
			sum=prev+next;
			prev=next;
			next=sum;
			System.out.println(next);
		}
		
//		int number=15;		 
//         int[] fibonancy = new int[number];
//         fibonancy[0] = 0;
//         fibonancy[1] = 1;
//         //System.out.print(fibonancy[0]+" "+fibonancy[1]+" ");
//                  
//         for(int i=2; i < 15; i++)
//         {
//             fibonancy[i] = fibonancy[i-1] + fibonancy[i-2];    //   1
//             
//            // System.out.print (fibonancy[i]+" ");
//         }
// 
//         for(int i=0; i< number; i++)
//         {
//                 System.out.print(fibonancy[i]+" ");
//         }
	}

}
