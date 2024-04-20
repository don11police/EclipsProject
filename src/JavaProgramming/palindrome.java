package JavaProgramming;

public class palindrome {
	
	public static void main(String[] args) {
		
		int r, sum=0, temp;
		
		int a = 121;
		temp=a;
		
		while(a>0) {
			
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		
		if(temp==sum) {
			System.out.println("palondrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
	}
	

}
