package valuelabsString;

public class FindDuplicateCharInString {
	
	public static void main(String[] args) {
		
		String str = "manual and automation testing";
		
		int cnt = 0;
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.charAt(i)=='a') {
				
				cnt++;
				
			}
			
		}
		
		System.out.println("Duplicate character of a is "+ cnt);
	}

}
