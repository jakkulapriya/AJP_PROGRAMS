package AJPJAVA;

public class Interface2 implements Interface1
{
	@Override
	public void m1(int a,int b)
	{
		System.out.println("Interface1 m1 method overridden");
	}
	static void m3() {
	   	 System.out.println("static method allowed from 1.8v ");
	    }
	 public void m4() {
	   	 System.out.println("private method");
	    }
	
	public static void main(String[] args)
	{
		Interface1 obj=new Interface2();
		obj.m1(10, 20);
		Interface1.m3();
		obj.m4();
		
	}
}
