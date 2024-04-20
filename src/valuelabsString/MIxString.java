package valuelabsString;

public class MIxString {
	
	public static void main(String[] args) {
		
    String str = "1a2b3c4g5r@#A$F%TG";
    
    String specil = str.replaceAll("[A-Z 0-9]", "");
    System.out.println(specil);
    
	}
	
	

}
