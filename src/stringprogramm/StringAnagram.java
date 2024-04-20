package stringprogramm;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
	
	String str = "SILENT IS";
	String str1 = "Listen is";
	
	str = str.replaceAll(" ", "");
	str1 = str1.replace(" ", "");
	
	str = str.toLowerCase();
	str1 = str1.toLowerCase();
	
	char[] a = str.toCharArray();
	char[] b = str1.toCharArray();
	
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
