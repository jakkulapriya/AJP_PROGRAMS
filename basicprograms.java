package AJPJAVA;

import java.util.Scanner;

public class basicprograms<scanner> {
	/*void n1() {
		int n=10;
		System.out.println("display the first 10 natural numbers");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		}
	void n2() {
		int n=10,sum=0;
		for(int i=1;i<=10;i++) {
			sum= sum+i;
		}
		System.out.println("sum of first 10 natural numbers :"  +sum);
	}
	void n3() {
			int N=100;
			int sum=0,i=0;
			while(i<=N) {
				sum=sum+i;
				i++;
				
	        } 
	        
	        System.out.println("Sum of first " + N + " Natural Number = " + sum); 
	}
	void n4()
	{
		int n=50;
		int sum=0;
		for(int i=0;i<=50;i++) {
			sum=sum+i;
		}
		System.out.println("sum of numbers"+sum);
		System.out.println("average of numbers:" +sum/n);
	}
	void n5() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input  the numbers : ");
		int n=sc.nextInt();
		   
		     for( int i=1;i<=n;i++)
		     {
		     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
		    }
	}
	void n6() {
		
		Scanner a = new Scanner(System.in);
		System.out.print("Input  the number ");
		int n=a.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println("the multiplication table is:   " +n+"*"+i+"="+n*i);
		}
	}*/
	/*void n7() {
		
		Scanner b = new Scanner(System.in);
		System.out.print("Input  the number from 1 to n ");
		int n=b.nextInt();
		for(int i=1;i<=10;i++)
	{			for(int j=1;j<=n;j++) 
		{				
		
		 System.out.print(j+ "*" +i+ "=" +i*j+",");
			}
			System.out.println("\n");		
	}
	}*/
	/*void n8() {
		Scanner b = new Scanner(System.in);
		System.out.print("enter the number of odd numbers" );
		int n=b.nextInt();
		int sum=0;
		System.out.println("the odd numbers are");
		for(int i=1;i<=2*n;i=i+2)
		{
			if (i % 2 != 0) {
		}
            System.out.println(i);
			sum=sum+i;
		}
	      System.out.println("Sum of first " + n + " Odd Numbers is: " +sum);
	}*/
	void n9() {
		int n=7;
		System.out.println("the right angle triangle pattern is");
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void n10()
	{
		int n=1;
		System.out.println("the right angle triangle pattern with numbers are");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				n=n+1;
			}
			System.out.println();
		}
	}
	void n11()
	{
		int n=1;
		System.out.println("the right angle triangle pattern with repeate numbers are");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				n=n+1;
			}
			System.out.println();
		}
		
	}
	void n12() {
		int n=1;
		System.out.println("the right angle triangle pattern is");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+"");
				n=n+1;
			}
			System.out.println();
		}
	}
	void n13() {
		
		
		int n=5,num=1;
		System.out.println("the pyramid pattern is");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
		   for(int k=0;k!=2*i-1;k++) {
			System.out.print(num+"");
			num=num+1;
		}
		
		System.out.println();
	}
		}
	void n14() {
		int n=6;
		System.out.println("the trianglr star pattern is");
		for(int i=1;i<=n;i++) {
			for( int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=0;k!=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void n15()
	{
		int a=5,fact=1;
		for(int i=1;i<=a;i++) {
		fact=fact*i;
		}
		System.out.println("factorial of "+a+ " is: "+fact);
	}
	void n16()
	{
		int n=18,sum=0;
		System.out.println("the even numbers are");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+"");
				sum=sum+i;
			}
		}
			System.out.println("sum of even numbers is:" +sum);
		}
	void n17() {
		
		int n=5;
		System.out.println("the pyramid number pattern is");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k!=2*i-1;k++) {
				System.out.print(i+"");
			
			}
			System.out.println();
		}
	}
	void n20() {
		int n=5;
		System.out.println(" odd * pyramid pattern");
		for(int i=1;i<=n;i++) {
			for( int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=0;k!=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
} 
	         void n21() 
	            {
		        int n = 5; 
		        long sum = calculateSeriesSum(n);
		        System.out.println("Sum of the series: " + sum);
		    }
		    static long calculateSeriesSum(int n) {
		        long sum = 0;
		        long term = 0;
		        for (int i = 1; i <= n; i++) {
		            term = term * 10 + 9;
		            sum += term;
		        }
		        return sum;
		    }
		

	
		
	
		


		public static void main(String[] args) {
		basicprograms obj= new basicprograms();
//		obj.n1();
//		obj.n2();
//		obj.n3();
//		obj.n4();
//		obj.n5();
//		obj.n6();
//		obj.n7();
//		obj.n8();
		obj.n9();
		obj.n10();	
		obj.n11();
		obj.n12();
		obj.n13();
		obj.n14();
		obj.n15();
		obj.n16();
		obj.n17();
		obj.n20();
		obj.n21();
}
}
