package javaprograms_interview;

public class Array_Number_Addition {
	
	public static void m1(){
		int n[]={1,2,3,4,6,8,11,28};
		int result = 0;
		int newresult=0;
		int res=0;
		int numb=0;
		for (int i = 0; i < n.length; i++) {
			result=n[i]+result;
			//System.out.println(result);
			if (n[i]==28) {
				newresult=n[i];
				//System.out.println(newresult);
			}if (n[i]==4) {
					 res=n[i];
					numb=newresult+res;
					System.out.println(numb);
			}
		}
	}

	public static void main(String[] args) {
		m1();

	}

}
