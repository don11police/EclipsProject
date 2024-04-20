package CodeVyasaArray;

public class GetOddEvenArray {
	
	public static void main(String[] args) {
		
		int [] arr = {2,354,36,47,568,6,15,12,564,36,45,68,67,98,345,43,656};
		
		System.out.println("even number from above array");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("odd number from above array");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
