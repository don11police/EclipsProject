package CodeVyasaArray;

public class Secondminvaluefromarray {
	
	public static void main(String[] args) {
		
		int [] arr = {234,43,56,45,67,587,35,5,568,65,87,6};
		
		int temp =0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("second min value from array "+arr[1]);
	}

}
