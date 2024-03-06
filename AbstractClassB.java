package AJPJAVA;

public class AbstractClassB extends AbstractClass{
	

	
	@Override
	void m1(int a, int b) {
		System.out.println("m1 method: "+a+" "+b);
		
		
	}
	@Override
     protected void m2(String s) {
		System.out.println("m2 method: " +s);
		
	}
	public static void main(String[] args) {
		AbstractClass obj = new AbstractClassB ();
		obj.m1(8, 5);
		obj.m2("java");
		
	}

}
