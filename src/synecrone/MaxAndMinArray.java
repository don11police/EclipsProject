package synecrone;

import java.util.Arrays;

public class MaxAndMinArray {
	
	public static void main(String[] args) {
		
		int arr [] = new int [] {23,4,436,546,324,45,565,6765,87,543,5,56,57,658};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
		}
		System.out.println(max);
		
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				
				min=arr[i];
			}
		}
		System.out.println(min);
		
		
		
		
	}
	

}
