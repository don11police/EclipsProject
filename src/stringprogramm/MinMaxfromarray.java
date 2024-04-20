package stringprogramm;

public class MinMaxfromarray {
	
	public static void main(String[] args) {
		
		int arr[] = {456,456,45,6,7,56,7,68,6,74,6,34,564,35,645,7,5687,76};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) {	
			max=arr[i];
		}	
			
		}
		System.out.println(max);
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}

}
