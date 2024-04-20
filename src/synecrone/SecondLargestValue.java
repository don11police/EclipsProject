package synecrone;

public class SecondLargestValue {
	
	public static void main(String[] args) {
		
		int arr [] = new int [] {23,4,436,546,324,45,565,6765,87,543,5,56,57,658};
		
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[1]);
		
	}

}
