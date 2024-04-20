package valuelabsString;

public class LengthOfEachString {
	
	public static void main(String[] args) {
		
		String str = "manual and automation";
		
		String[] word = str.split(" ");
		
		
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
			System.out.println(word[i].length());
			
		}
		
		
		
	}

}
