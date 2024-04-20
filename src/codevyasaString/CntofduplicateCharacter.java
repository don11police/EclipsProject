package codevyasaString;

public class CntofduplicateCharacter {
	
	public static void main(String[] args) {
		
		String str = "manual testing";
		
		int cnt = 0;
		
		System.out.println("count of a is :- ");
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a') {
				
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
