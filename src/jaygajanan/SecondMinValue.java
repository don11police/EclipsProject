package jaygajanan;

public class SecondMinValue {
	
	public static void main(String[] args) {
		
		int arr[] = new int [] {43,456,54,645,765,6,568,7768,76,867,8};
		
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i; j<arr.length-1; j++) {
				
				if(arr[i]>arr[j]) {
				
				temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
					
			}
		}
		}
		System.out.println(arr[1]);
		
	}

}
