package JavaProgramming;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String x = "listen";
				String y = "silent";
				
				char[] a = x.toCharArray();
				char[] b = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result==true) {
			System.out.println("string is anagram");
		}
		else {
			System.out.println("string is not anagram");
		}
				
	}

}
