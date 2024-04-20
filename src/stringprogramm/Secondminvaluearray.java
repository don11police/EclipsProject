package stringprogramm;

public class Secondminvaluearray {
	
	public static void main(String[] args) {
		
		int [] arr = {456,45,76456,7,4576,576,587,45,86,78,567,456,743,534,456,457,568,7};
		
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					
					arr[i]=temp;
					arr[i]=arr[j];
					temp=arr[j];
				}
			}
		}
		System.out.println(arr[1]);
		
	}

}
