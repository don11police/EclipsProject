package valuelabsString;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String str = "SILENT";
		String str1= "LISTEN";

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
