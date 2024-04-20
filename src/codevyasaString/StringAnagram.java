package codevyasaString;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String str = "Listen is";
		String str1 = "Silent is";
		
		 str.replace(" " , "");
		 str1.replace(" " , "");
		
		str.toLowerCase();
		str1.toLowerCase();
		
		char[] a = str.toCharArray();
		char[] b = str.toCharArray();
		
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
