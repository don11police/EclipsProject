package JavaProgramming;

public class Convertsmall {
	
	public static void main(String[] args) {
		
		String str = "manual and automation";
		
		String[] word = str.split(" ");
		for(int i=0; i<=word.length-1; i++) {
			
			//System.out.println(word[i].length());
			
	String small = word[i];
	
		
		String smalll = small.substring(0, 2)+small.substring(2, 3).toUpperCase()+small.subSequence(3, small.length());
		
		System.out.println(smalll);
		
		
	}
	
	}
}
