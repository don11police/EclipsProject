package JavaProgramming;

public class maxoccaranceofchar {
	
	public static void main(String[] args) {
		
		String str = "java programming java oops";
		
		int totalcnt = str.length();
		
		System.out.println(totalcnt);
		
		int remove = str.replace("a", "").length();
		
		int count = totalcnt-remove;
		
		System.out.println(count);
		
		
	}
	

}
