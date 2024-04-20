package valuelabsString;

public class CountStringWithoutSpace {
	
	// count of string without space
	
	public static void main(String[] args) {
		
		String str = "manual and automation testing";
		System.out.println("length of string with spacce"+ str.length());
		
		int cnt=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)!=' ') {
				cnt++;
				
			}
		}
		System.out.println("count of string without space "+ cnt);
		
	}

}
