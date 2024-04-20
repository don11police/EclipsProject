package retesting;

public class ConcreateClass extends Abstarctclass {

	public void m1() {
		
		System.out.println("incomplete method complete here");
	}
	
	public static void main(String[] args) {
		
		ConcreateClass cc = new ConcreateClass();
		
		cc.m1();
		cc.m2();
		
	}
	
	
	
	
}
