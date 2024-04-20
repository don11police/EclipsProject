package valuelabsString;

public class SmallString {
	
	public static void main(String[] args) {
		
		String str = "manual andand automation testing";
		
		String[] word = str.split(" ");
		
		for(int i=0; i<=word.length-1; i++) {
			System.out.println(word[i].length());
			
			String cap = word[i];
			
			String uppar = cap.substring(0, 3)+cap.substring(3, 5).toUpperCase()+cap.substring(5, cap.length());
			System.out.println(uppar);
			
		}
		
	}

}
