package jaygajanan;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int arr[] = new int [] {5,45,6,456,57,67,867,8,678,45,6,456,4,3445,355,5,4,};
		
		System.out.println("Du[licate array");
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				                                                                                                                                        
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
				
			}
			
		}
		
	}

}
