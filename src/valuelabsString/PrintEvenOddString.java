package valuelabsString;

public class PrintEvenOddString {
	//Print even odd string
	
	public static void main(String[] args) {
		
		String str = "maunal and automation testing good";
		String[] word = str.split(" ");
		
		for(int i=0; i<word.length; i=i+2) {
			
			System.out.println(word[i]+" ");
		}
		
		for(int i=1; i<word.length; i=i+2) {
			System.out.println(word[i]+"");
		}
		
	}
	

}
