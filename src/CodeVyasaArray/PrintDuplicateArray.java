package CodeVyasaArray;

public class PrintDuplicateArray {
	
	public static void main(String[] args) {
		
		//print duplicate from array in console
		
		int [] arr = {1,2,3,1,4,5};
		
		System.out.println("Duplicate number in array ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[j]);
				}
			}
			
		}
	}

}
