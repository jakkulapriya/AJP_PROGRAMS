package AJPJAVA;

public class wrapperclasses
{
	void a1(){
		System.out.println("auto boxing");
		int a=10;
		Integer b= Integer.valueOf(a);
		System.out.println(b);
		
		char c ='h';
		Character d= Character.valueOf(c);
		System.out.println(d);
		
		Float f = 5.345f;
		float f1= Float.valueOf(f);
		System.out.println(f1);	
		
		Double d1= 3456.234;
		double d2 = Double.valueOf(d1);
		System.out.println(d2);
		
		System.out.println("Auto unboxing");
		Integer i= 20;
		int s= i.intValue();
		System.out.println(s);
		 
		Long l1=3456213782L;
		long l2=l1.longValue();
		System.out.println(l2);

		Double g = 435637.99;
		double z = g.doubleValue();
		System.out.println(z);
		 
		char c1='p';
		Character c2= Character.valueOf(c1);
		System.out.println(c2);
		
		
		
	}
	


	public static void main(String[] args) {
		wrapperclasses obj = new wrapperclasses();
		obj.a1();		
		

	}

}
