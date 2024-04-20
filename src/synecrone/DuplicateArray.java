package synecrone;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int arr [] = new int [] {23,4,436,5,324,45,23,65,87,543,5,56,57,658};
		
		System.out.println("duplicate array are");
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
			}
			
		}
		
		
		
	}

}
