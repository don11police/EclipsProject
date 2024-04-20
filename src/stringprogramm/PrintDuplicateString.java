package stringprogramm;

public class PrintDuplicateString {
	
	public static void main(String[] args) {
		
		String str = "big, black, big, bull, cool, bull, big, thera, mera, black,";
		
		String[] word = str.split(" ");
		int cnt=0;
		
		System.out.println("Duplicate string name");
		
		for(int i=0; i<word.length; i++) {
			cnt=1;
			
			for(int j=i+1; j<word.length; j++) {
				
				if(word[i].equals(word[j])) {
					
					cnt++;
					word[j]="0";
					
				}
				
			}
			
		    if(cnt>1 && word[i]!="0") {
		    	System.out.println(word[i]);
		    }
			
		}
		
		
		
		
	}

}
