package AJPJAVA;

public class unaryoperators {
	void unary()
	{
		int a=20,b=40,c=9;
		System.out.println(++a);
		System.out.println(a);
		System.out.println(--b);
		System.out.println(b);
		System.out.println(c--);
		System.out.println(c);
	}
      void arithmetic()
      {
    	  int a=12,d=90;
    	  System.out.println("addition: "+(a+d));
    	  System.out.println(5/2.0);
    	  System.out.println(124/17);
      }
     void logical()
     {
	int a=10,b=5,c=15;
	System.out.println(a>b&&a<c&&c>b);
	System.out.println(a<b&&(++b)<c&&(c++)>a);
}
	void b1() {
		int a=12,b=30,c=45;
		if(a>c)
		{
			System.out.println("a is greater");
		}else
		{
			System.out.println("c is greater");
		}
		if(c>a) {
			System.out.println("c is greater");
		}
		else {
			System.out.println("a is greater");
		}
		
		}
	
  
   
	public static void main(String[] args) {
		unaryoperators obj=new unaryoperators();
		obj.unary();
		obj.arithmetic();
		obj.logical();
		obj.b1();
		

	}

	
}
