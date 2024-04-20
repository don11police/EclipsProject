package ValueLabsArray;

public class oddevenfromarray {
	
	public static void main(String[] args) {
		
		int arr [] =  {45,4,545,6,457,65,6,7,56,87,768,};
		System.out.println("odd number is array");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2!=0) {
				
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("even number from array");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			
		}
			
		}
		
	}

}
