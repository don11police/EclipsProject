package codevyasaString;

public class PrintDuplicateString {
	
	public static void main(String[] args) {
		
		//print duplicate string from give length
		
	String str = "big bash big bull gull chull gull bash";
	
	int cnt=0;
	
	String[] word = str.split(" ");
	
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
