package JavaBasicProgram;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		//by reversing the value deos not change
		
		int A = 121;
		
		int r , sum=0, temp;
		
		temp=A;
		
		while(A>0){
		
			r=A%10; //1
			sum=(sum*10)+r; //1
			A=A/10; //12.1
		}
		
		if(temp==sum) {
			
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not a palindrome number");
		}
	}

}
