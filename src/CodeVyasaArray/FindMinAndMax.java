package CodeVyasaArray;

import java.util.Arrays;

public class FindMinAndMax {
	
	public static void main(String[] args) {
		
		int [] arr = {23,53,44,5,4567,867,98,9,67,435,64,35,6,47};
		
		Arrays.sort(arr);
		
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("maximum value from array "+max);
		
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("minimum value from array "+min);
		
		
	}

}
