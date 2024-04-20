package JavaBasicProgram;

public class NumberPrimeorNot {
	
	public static void main(String[] args) {
		
		int A = 13;
		
		int temp = 0;
		
		for(int i=2; i<A-1; i++) {
			
			if(A%i==0) {
				
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime");
		}
	}

}
