package stringprogramm;

public class RemoveDuplicate {
	
	//remove duplicate string
	public static void main(String[] args) {
		
	
	
	String str = "ram, sham, golu, molu, sham, ram, sham,";
	
	String[] word = str.split(" ");
	
	for(int i=0; i<word.length; i++) {
		for(int j=0; j<word.length; j++) {
			
			if(word[i]!=(word[j])) {
				
				if(i!=j) {
					
					
				word[j]="";
					
				}
			}
		}
		
		if(word[i]!="") {
			System.out.println(word[i]);
		}
	}
	
	
	}

}
