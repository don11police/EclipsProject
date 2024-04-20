package codevyasaString;

public class RemoveDuplicateString {
	
	public static void main(String[] args) {
		
		//remove duplicate from given string
		
		String str = "ramesh, suresh, dinesh, ramesh, suresh, ram,";
		
		String[] word = str.split(" ");
		
		for(int i=0; i<word.length; i++) {
			for(int j=i+1; j<word.length; j++) {
				
				if(word[i].equals(word[j])) {
					
					if(i!=j)
						word[j]="";
						
				}
			}
			if(word[i]!="") {
				System.out.println(word[i] + " ");
			}
		}
		
	}

}
