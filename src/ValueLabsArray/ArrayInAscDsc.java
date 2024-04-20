package ValueLabsArray;

import java.util.Arrays;

public class ArrayInAscDsc {
	
	//Array in ASC and Dsc order
	
	public static void main(String[] args) {
		
	  Object [] arr = new Object [] {45,4,545,6,457,65,6,7,56,87,768,};
	  
	  Arrays.sort(arr);
	  System.out.println("Arrays in Asc order");
	  for(int i=0; i<=arr.length; i++) {
		  System.out.println(arr[i]);
	  }
	 
	  for(int i=arr.length-1; i>0; i--) {
		  System.out.println(arr[i]);
	  }
		
	}

}
