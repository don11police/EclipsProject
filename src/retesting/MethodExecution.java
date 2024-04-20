package retesting;

public class MethodExecution {
	
	static int num = 20;
	int num2 = 203;
	
	
	static 
	{
		System.out.println("This is static block");
	}

	{
		System.out.println("This is non static block");
	}
	
	MethodExecution()
	{
	System.out.println("This is constructor");	
		
	}
	
	public static void staticvariable() {
		
		System.out.println("this is static variable" + num);
	}
	
	public void nonstatic() {
		
		System.out.println("this is non static variable "+this.num2);
	}
	
	public static void main(String[] args) {
		
		MethodExecution me = new MethodExecution();	
		staticvariable();
		me.nonstatic();
		
	}
	
}
