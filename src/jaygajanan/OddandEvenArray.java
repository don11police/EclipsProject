package jaygajanan;

public class OddandEvenArray {
	
	public static void main(String[] args) {
		
		int arr [] = new int [] {435,43,545,645,6,57,5687,76,8345,345,435,4,545,6,45,65,7,568,87,};
		
		System.out.println("even number from number array");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2!=0) {
				
				System.out.println(arr[i]+" ");
			}
			
		}
		
		System.out.println("odd number from array");
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]+" ");
			}
		}
		
	}

}
