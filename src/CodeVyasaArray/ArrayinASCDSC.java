package CodeVyasaArray;

import java.util.Arrays;

public class ArrayinASCDSC {
	
	public static void main(String[] args) {
		
		int [] arr = {23,53,44,5,4567,867,98,9,67,435,64,35,6,47};
		
		 Arrays.sort(arr);
		
		System.out.println("Arrays in ASC order");
		
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Arrays in DSC order");
		
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.println(arr[i]);
		}
			
		
	}

}
