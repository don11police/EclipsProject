package valuelabsString;

public class RemoveDplicateString {
	
	public static void main(String[] args) {
		
		String str = "ram, pravin, mahendra, ram, pravin, sandip, mahendra,";
	     
		String lower = str.toLowerCase();
		
		String[] word = lower.split(" ");
		
		for(int i=0; i<word.length; i++) {
			for(int j=i+1; j<word.length; j++) {
				
				if(word[i].equals(word[j])) {
					if(i!=j)
					
					word[j]="";
				}
			}
			
			if(word[i]!="") {
				System.out.print(word[i]+" ");
			}
		}
		
		
	}

}
