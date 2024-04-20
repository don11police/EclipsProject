package JavaProgramming;

import java.util.Arrays;

public class ArrayinASCandDScorder {
	
	public static void main(String[] args) {
		
		int []a = {23,34,546,345,45,23,456,235,43,654,457,234,234,434,47,678};
		Arrays.sort(a);
		
		System.out.println("Array in Asc order");
		for(int i=0; i<=a.length-1; i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("Arrays in DSC order");
		
		for(int i=a.length-1; i>=0; --i) {
			
			System.out.println(a[i]);
		}
		
		
	}

}
