package synecrone;

public class oddandevenfromarray {
	
	public static void main(String[] args) {
		
		int arr [] = new int [] {23,4,436,546,324,45,565,6765,87,543,5,56,57,658};
		
		System.out.println("odd numbers");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+" ");
			}
		}
		
		System.out.println("even numbers are");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
