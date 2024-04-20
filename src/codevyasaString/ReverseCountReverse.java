package codevyasaString;

public class ReverseCountReverse {
	
	public static void main(String[] args) {
		
		String str = "manaul testing";
		
		String countwithoutspace = str.replace(" ", "");
		System.out.println("count without space "+ countwithoutspace.length());
		
		String[] word = str.split(" ");
		
		for(int i=word.length-1; i>=0; i--) {
			System.out.println(word[i]);
			
		}
		
		
	}

}
