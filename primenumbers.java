package AJPJAVA;

public class primenumbers {
//	void c1() {
		/*int n=3;
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
			if(c==2) {
				System.out.println("it is a prime number");
			}
			else {
				System.out.println("it is not a prime number");
			}
		}*/
	
	    	
void rangeofprimes() {
	int a=1,b=100;
	for(int i=a;i<=b;i++) {
		int n=i;
		int c=0;
		for(int j=1;j<=n;j++) 
		{
			if(n%j==0) 
			{
				c++;
			}
		}if(c==2) {
			
		
		System.out.println(i);
	}
}
}

		
	public static void main(String[] args) {
		primenumbers obj =new primenumbers();
//		obj.c1();
		obj.rangeofprimes();
		}
}
