package JavaProgramming;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int [] a = {3,42,32,546,34,5687,234,657,35,3,67,42,546};
		
		System.out.println("duplicate array is");
		
		for(int i=0; i<=a.length-1; i++) {
			for(int j=i+1; j<=a.length-1; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
