package ValueLabsArray;

public class FindMaxandMin {
	
	public static void main(String[] args) {
		
		int arr [] =  {45,4,545,6,457,65,6,7,56,87,768,};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
				
			}
		}
		System.out.println(max);
			
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
				
			}
		}
		System.out.println(min);
		
		
		
	}

}
