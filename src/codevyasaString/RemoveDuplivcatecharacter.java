package codevyasaString;

import java.util.LinkedHashSet;

public class RemoveDuplivcatecharacter {
	
	public static void duplicate(String str) {
		
		//remove duplicate only
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			
			set.add(str.charAt(i));
			
		}
			
			for(char ch : set) {
				System.out.println(ch);
			}
			
		
		
	}
	
	public static void main(String[] args) {
		
		String str = "manual testing";
		duplicate(str);
	}

}
