package AJPJAVA;

public class looping {
	void c1()
	{
		int n=10;
		while(n<=20) {
			System.out.println(n);
			n++;
		}
	}
	void c2()
	{
		System.out.println("count the numbers");
		int n=546535;
		int d=0;
		while(n>0) {
			int remainder=n%10;
			d++;
			n=n/10;
		}
			System.out.println(d);
			
		}
	void c3() 
	{

		System.out.println("do-while loop");
		int n1=9;
		do {
			System.out.println(n1);
			n1++;
		}while(n1<5);
		
	}

	
	
		public static void main(String[] args) {
	
	/*	int j,k,n=8;
		for(int i=1;i<=10;i++) {
		System.out.println(i);	
		}
for(int i=20;i>=1;i--) {
	System.out.println(i);
}
		for(int i=n;i>=1;i--) {
			for(j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
			for(k=0;k!=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
}
		for( int i=1;i<=5;i++) {
			for( int j=0;j<=3;j++) {
				System.out.println(i+" "+j);
				
			}
			System.out.println(" ");
		}
		for(int i=2;i<=10;i=i+2) {
			System.out.println(i);
		}
		for(int i=2;i<=50;i=i*2) {
			System.out.println(i*i);
		}
}*/
	looping obj=new looping();
	obj.c1();
	obj.c2();
	obj.c3();
	}
	}
