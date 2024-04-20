package JavaProgramming;

import java.util.Arrays;

public class StringAnagramdoubleword {
	
	public static void main(String[] args) {
		
	
	
	String x = "LisTen iS";
	String y = "SilEnt Is";
	
	x = x.replace(" ", "");
	y = y.replace(" ", "");
	
	x=x.toLowerCase();
	y=y.toLowerCase();
	
	char[] a = x.toCharArray();
	char[] b = y.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);
	
	boolean result = Arrays.equals(a, b);
	
	if(result==true) {
		
		System.out.println("anagram");
	}
	else {
		System.out.println("not anagram");
	}

	}
	
}
