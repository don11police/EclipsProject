package CodeVyasaArray;

public class FindMaxandMinFromarray {
	
	public static void main(String[] args) {
		
	
	
	int [] arr = {23,53,44,5,4567,867,98,9,67,435,64,35,6,47};
	
	int max=arr[0];
	
	for(int i=0; i<arr.length; i++) {
		
		if(arr[i]>max) {
			
			max=arr[i];
		}
	}
	System.out.println("maximum value from array "+ max);
	
	int min = arr[0]; 
	
	for(int i=0; i<arr.length; i++) {
		
		if(arr[i]<min) {
			
			min=arr[i];
		}
	}
	System.out.println("minimum value from array "+ min);
		
	}
}
