package valuelabsbasicprogram;

public class CheckNumberIsPrimeorNot {
	
	public static void main(String[] args) {
		
		int number=3;
		int temp=0;
		
		for(int i=2; i<=number-1; i++) {
			
			if(number%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0){
		System.out.println("prime number");	
		}
		else {
			System.out.println("not a prime number");
		}
	}

}
