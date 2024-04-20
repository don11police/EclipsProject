package jaygajanan;

import java.util.Arrays;

public class ArrayInAscDsc {
	
	public static void main(String[] args) {
		
	
	int arr [] = new int [] {4,5,5,45,456,56,56,7,657,5678,67,8,67,567,56,7};
    
	Arrays.sort(arr);
	
	System.out.println("Arrays in asc order");
	for(int i=0; i<=arr.length-1; i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("arrays in dsc order");
	for(int i=arr.length-1; i>0; i--) {
		
		System.out.println(arr[i]);
	}
	
	
	}
	

}
