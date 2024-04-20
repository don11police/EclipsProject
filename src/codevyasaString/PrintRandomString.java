package codevyasaString;

public class PrintRandomString {
	
	public static void main(String[]args) {
	
	String str = "Mahendra Chungde";
	
	String[] word = str.split("");
	
	System.out.println("word is "+word.length);
	
	for(int i=0; i<word.length; i=i+2) {
		
		System.out.print(word[i]);
	}
	
	for(int i=1; i<word.length; i=i+2) {
		
		System.out.print(" "+word[i]);
	}
	
	}
	

}
