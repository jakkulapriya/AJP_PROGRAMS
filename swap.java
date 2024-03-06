package AJPJAVA;

public class swap {
	
	void m1() {
		int a=10;
		int b=30;
		System.out.println("swapping");
		//System.out.println("using =,-");
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
		System.out.println("using *,/");
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println(a);
	System.out.println(b);	
	}
	
	void m2() {
		String s= "priyanka";
		int Age=25;
		System.out.println("s is:"+s);
		System.out.println("Age is:"+Age);
		System.out.println("s is:"+s+" "+"Age is:"+Age);
		System.out.println("s is:"+s+"\n"+"My Age is:"+Age);

	
	}
	public static void main(String[]args) {
	 swap obj=new swap();
	 obj.m1();
	 obj.m2();

	
	}
//		int a=10,b=8;
////		System.out.println("swapping using 3rd variable");
////		t=a=10;
////		a=b=8;
////		t=b=10;
////		System.out.println("After swapping: "+a +"   " + b);  
////		
	}
		
	



