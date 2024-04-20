package retesting;

public class GlobalVariable {
	
	
		
		int num = 130;
		int num2 = 3245;
		
	public void test1() {
		
	 System.out.println("global variable in test1 " + num );
		
	}
	
	public void test2() {
		
		System.out.println("global variable in test2 " + num2);
	}
		
	
	public static void main(String[] args) {
		
		GlobalVariable gb = new GlobalVariable();
		
		gb.test1();
		gb.test2();
		
	}
	

}
