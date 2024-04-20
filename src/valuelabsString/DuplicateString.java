package valuelabsString;

public class DuplicateString {
	
	public static void main(String[] args) {
		
		String str = "Manual and Automation manual Testing automation and";
		int cnt;
		
	    String lower = str.toLowerCase();
	    
	    String[] word = lower.split(" ");
	    
	    System.out.println("Duplicate string in given character ");
	    
	    for(int i=0; i<word.length; i++) {
	    	
	    	cnt=1;
	    	
	    	for(int j=i+1; j<word.length; j++) {
	    		
	    		if(word[i].equals(word[j])) {
	    			
	    			cnt++;
	    			word[j]= "0";
	    		}
	    		
	    	}
	    	
	    	if(cnt>1 && word[i]!="0") {
	    		System.out.println(word[i]+ " " );
	    	}
	    }
		
	
		
		
	}

}
