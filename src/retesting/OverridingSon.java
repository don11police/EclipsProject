package retesting;

public class OverridingSon extends OverridingFather {
	
	public void car() {
		
		System.out.println("son's car");
	}
	
	public static void main(String[] args) {
		
		OverridingSon son = new OverridingSon();
		
		son.car();
		
	}

}
