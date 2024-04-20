package valuelabsString;

public class NumberofDuplicateCharacterinString {
	
	public static void main(String[] args) {
			//number of duplicate character in string 
	
	String str = "manual acntnd automation testing";
	
         char[] word = str.toCharArray();
         
         for(int i=0; i<str.length()-1; i++) {
        	 for(int j=i+1; j<=str.length()-1; j++) {
        		 
        		 if(word[i]==word[j]) {
        			 
       System.out.print(word[j]+ " ");
        		 }
        	 }
        	 
         }
	}
	

}
