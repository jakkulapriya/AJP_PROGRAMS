package AJPJAVA;

public class constructors {
	public  constructors()
	{
		System.out.println("Default constructor");
	}
	public constructors(String s)
	{
		System.out.println("parameterized constructor:"+s);
	}
	public constructors(int a,int b,int c)
	{
		System.out.println("parameterized constructor:"+(a+b+c));
	}
	

	public static void main(String[] args) {
		constructors obj= new constructors("JAVA");
		new constructors();
		new constructors(30,60,59);
		

	}

}
