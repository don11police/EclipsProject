package JavaProgramming;

public class DuplicateString {
	
	public static void main(String[] args) {
		
		String str = "manual and automation testing";
		
		char[] duplicate = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				
				if(duplicate[i]==duplicate[j]) {
					
				
				System.out.print(duplicate[j] +" ");
				break;
				}
			}
		}
		
	}

}
