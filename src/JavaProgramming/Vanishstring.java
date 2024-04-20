package JavaProgramming;

public class Vanishstring {
	
	public static void main(String[] args) {
		
		String str = "mahendra chungde";
		
		String[] word = str.split("");
		
		for(int i=0; i<=word.length-1; i=i+2) {
			
			System.out.println(word[i]);
		}
	}

}
