package synecrone;

public class prime {
	
	public static void main(String[] args) {
		
		int A = 121;
		
		int r, sum=0, temp;
		
		temp=A;
				
		while(A>0) {
			
			r=A%10;
			sum = (sum*10)+r;
			A=A/10;
		}
		
		if(temp==sum) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not A  prime number");
		}
	}

}
