package retesting;

public class InterfaceCalssComplete implements AllIncomplete{
	
	public void m1() {
		
		System.out.println("m1 method completed");
	}
	
	public void m2() {
		
		System.out.println("m2 method completed");
	}
	
	public static void main(String[] args) {
		
		InterfaceCalssComplete cc = new InterfaceCalssComplete();
		
		cc.m1();
		cc.m2();
		
	}

}
