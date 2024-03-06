package AJPJAVA;

public class ThisKeyword {
		int a=10; //instance variable
		
		void m1()
		{ 
			int a=40;//local
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(new ThisKeyword().a);
		this.m2();	
		this.m3();
	}	
		void m2(){
			System.out.println("m2 non-static method");
		}
		static void m3()
		{
			
			System.out.println("m3 static method");
		}
		ThisKeyword(int a,int b)
		{
			System.out.println("2 parameters constructor"+(a+b));
		}
		ThisKeyword()
		{
			this(10,20);
			System.out.println("Default constructor");
		}
		ThisKeyword(String s)
		{
			this();
			System.out.println("parametrized constructor: "+s);
		}

		public static void main(String[] args)
		{
			ThisKeyword obj=new ThisKeyword("Java");
//			obj.m1();
//			obj.m2();
		}
}
	

	


