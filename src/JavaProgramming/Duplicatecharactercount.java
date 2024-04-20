package JavaProgramming;

public class Duplicatecharactercount {
	
	public static void main(String[] args) {
		
		String str = "mahendra chungde";
		
		int cnt =0;
		int cnt1 = 0;
		
		for(int i=0; i<=str.length()-1; i++) {
			
			if(str.charAt(i)=='a') {
				cnt++;
				
			}
			if(str.charAt(i)=='h') {
				cnt1++;
			}
		}
		System.out.println("a char cnt is "+cnt);
		System.out.println("h char cnt is "+cnt1);
		
	}

}
