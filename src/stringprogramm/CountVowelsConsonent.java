package stringprogramm;

public class CountVowelsConsonent {

	public static void main(String[] args) {
		
		String str = "learne manual";
		
		System.out.println(str.length());
		
		int vcnt=0  , ccnt= 0;
		
		for(int i=0; i<=str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='e' ||
					str.charAt(i)=='i')
			{
				vcnt++;
			}
			
			
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				
			      ccnt++;
			}
			
				
			}
		System.out.println(vcnt);
		System.out.println(ccnt);
		
	}
	
}
