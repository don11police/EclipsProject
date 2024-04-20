package codevyasaString;

public class FindDuplicateCharacterFromString {
	
	
	public static void main(String[] args) {
		
		//print duplicate only
		
		String str = "manual testing";
		char[] duplicate = str.toCharArray();
		
		System.out.println("Duplicate character in given string");
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				
				if(duplicate[i]==duplicate[j]) {
					
					System.out.println(duplicate[j] + " ");
					break;
					
				}
			}
			
		}
		
	}

}
