package stringprogramm;

import java.util.LinkedHashSet;

public class RemoveDplicateCharacter {
	
	public static void main(String[] args) {
		
		String str= "learne java today";
		
		LinkedHashSet <Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<str.length(); i++) 
			
		set.add(str.charAt(i));
		
		for(Character ch : set)
			System.out.print(ch);
		
	}
	
	

}
