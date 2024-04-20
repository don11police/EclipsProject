package jaygajanan;

public class SecondLargestValue {
	
	public static void main(String[] args) {
		
		int arr [] = new int [] {534,534,5,456,456,45,676,5,76,78,6798};
		
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i; j<arr.length-1; j++) {
				
				if(arr[i]<arr[j]) {
					
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
					
				}
			}
		}
		System.out.println(arr[1]);
	
		
		
	}
	

}
