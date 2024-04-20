package stringprogramm;

import java.util.HashSet;

public class RemoveDuplicatefromArray {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,4,3,1,4,2};
		
		HashSet <Integer> hs = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			
			hs.add(arr[i]);
		}
			for(int no:hs) {
				System.out.println(no);
			}
			
		}
		
		
	
	

}
