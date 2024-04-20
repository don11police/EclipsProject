package CodeVyasaArray;

import java.util.HashSet;

public class RemoveDuplicatefromarray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,2,4,5,8,5,9};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			
			set.add(arr[i]);
		}
		
			for(int no:set) {
				System.out.println(no+ " ");
			}
			
			
		}
		
	

}
