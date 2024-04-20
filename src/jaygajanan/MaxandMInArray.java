package jaygajanan;

public class MaxandMInArray {

	
	public static void main(String[] args) {
		
		int arr[] = new int [] {5,45,6,456,57,67,867,8,678,45,6,456,4};
		
		System.out.println("max value from array");
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
		   if(arr[i]>max) {
			   
			   max = arr[i];
		   }
		   
		}
		System.out.println(max);
		
	System.out.println("min value from array");	
	int min = arr[0];
	for(int i=0; i<arr.length; i++) {
		
		if(arr[i]<min) {
			min = arr[i];
			
		}
	}
	System.out.println(min);
		
		
		
	}
}
