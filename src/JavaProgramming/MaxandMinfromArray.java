package JavaProgramming;

import java.util.Arrays;

public class MaxandMinfromArray {
	
	public static void main(String[] args) {
		
		int [] a = {34,45,23,456,67,12,89,890,56,23,123,4656,5,62,321,23};
		
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println(max);
		
	int min = Arrays.stream(a).min().getAsInt();
	
	System.out.println(min);
		
	}
	

}
