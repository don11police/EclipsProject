package stringprogramm;

import java.util.Arrays;

public class ArrayinASCDSC {
	
	public static void main(String[] args) {
		
	int a [] = new int [] {436,4,5645,6,67,567,56,8,67,876,8876,89,687,967};
	Arrays.sort(a);
	System.out.println("Arrays in ASC order");
	
	for(int i=0; i<=a.length; i++) {
		System.out.println(a[i]);
	}
	
	System.out.println("Arrays in DSC order");
	
	for(int i=a.length-1; i>=0; i--) {
		
		System.out.println(a[i]);
	}

	
	}
	
	
	
}
