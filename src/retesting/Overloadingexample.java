package retesting;

public class Overloadingexample {
	
	public void test1(int num1, int num2) {
		
		int addition = num1+num2;
		
		System.out.println(addition);
	}
	
	public void test1(int num1 , float num2) {
		
		float addition = num1+num2;
		
		System.out.println(addition);
	}
	
	public static void main(String[] args) {
		
		Overloadingexample over = new Overloadingexample();
		
		over.test1(243, 12);
		over.test1(234, 23.2f);
		
	}

}
