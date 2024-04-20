package JavaProgramming;

public class MaxandMin {
	
	public static void main(String[] args) {
		
		int [] a = {34,45,23,456,67,12,89,890,56,23,123,4656,5,62,321,23};
		
		int max =a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>max) {
				
				max = a[i];
			}
		}
		System.out.println(max);
		
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<min) {
				
				min = a[i];
				
			}
			
		}
		System.out.println(min);
	}

}
