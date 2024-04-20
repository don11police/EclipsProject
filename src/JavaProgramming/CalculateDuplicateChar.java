package JavaProgramming;

public class CalculateDuplicateChar {
	
	public static void main(String[] args) {
		
		String str = "mahendra rajendra chungde";
		
		
		int cnt = 0;
		
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)=='d') {
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}
	

}
