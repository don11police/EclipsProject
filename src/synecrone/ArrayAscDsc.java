package synecrone;

import java.util.Arrays;

public class ArrayAscDsc {
	
	public static void main(String[] args) {
		
		int arr [] = new int [] {23,4,436,546,324,45,565,6765,87,543,5,56,57,658};
		
		Arrays.sort(arr);
		
		System.out.println("Arrays in Asc order");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Arrays in Dsc order");
		
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.println(arr[i]);
		}
		
	}

}
