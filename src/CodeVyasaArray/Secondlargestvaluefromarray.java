package CodeVyasaArray;

public class Secondlargestvaluefromarray {
	
	public static void main(String[] args) {
		
		int [] arr = {345,543,645,74,57,5,76,84,5,23,45,7,68,45,36,58,9};
		
		int temp =0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
			
			if(arr[i]<arr[j]) {
				
				temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				
			}
			}
				
			}
		
		System.out.println("second largest value from array "+ arr[1]);
		}
		
		
	}


