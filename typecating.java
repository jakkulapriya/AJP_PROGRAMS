package AJPJAVA;

public class typecating {
	void a1() {
		System.out.println("implicit datatype");
		System.out.println("coverting byte to short");
		byte b1= 12;
		short s1  =b1;
		System.out.println(b1);
		System.out.println(((Object)s1).getClass().getSimpleName());
		
		System.out.println("coverting int to long");
		int i1=345;
		long l1=i1;
		System.out.println(l1);
		System.out.println(((Object)l1).getClass().getSimpleName());
		
		System.out.println("converting float to double");
		float f1=3.56789214213312f;
		System.out.println(f1);
		double d1=f1;
		System.out.println(d1);
		
		System.out.println("converting int to double");
		int i11= 765;
		System.out.println(i11);
		double d11=i11;
		System.out.println(d11);

	}
	
	void a2() {
		System.out.println("explicit typecasting");
		System.out.println("converting short to byte");
		short s1=35; //2byte
		byte b1=(byte)s1; //1byte
		System.out.println(b1);
		System.out.println(((Object)b1).getClass().getSimpleName());
		

		System.out.println("explicit datatype");
		System.out.println("conerting int to float");
		int i2=7895;
		float f2=(float)i2;
		System.out.println(f2);
		System.out.println(((Object)f2).getClass().getSimpleName());
		
	
		System.out.println("conerting int to double");
		int i3=78935;
		double d5=(double)i3;
		System.out.println(d5);
		System.out.println(((Object)d5).getClass().getSimpleName());
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typecating obj =new typecating();
		obj.a1();
		obj.a2();

	}

}
