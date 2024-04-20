package codevyasaString;

public class Lengthofeachstring {
	
	public static void main(String[] args) {
		
		String str = "manual testing";
		
		
		
		String[] word = str.split(" ");
		
		for(int i=0; i<word.length; i++) {
			
			System.out.println(word[i]);
			System.out.println(word[i].length());
		}
		
		//reverse string
		
		for(int i=word.length-1; i>=0; i--) {
			System.out.println(word[i]);
		}
		
	}

}
