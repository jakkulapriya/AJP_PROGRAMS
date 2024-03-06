package AJPJAVA;

import java.io.PrintStream;
import java.util.Scanner;

public class arrays {
	void a1() {
	
	/*int[] ele = {12, 4, 5, 2, 5};
	  
	   System.out.println("Accessing Elements of Array:");
	   System.out.println("First Element: " + ele[0]);
	   System.out.println("Second Element: " + ele[1]);
	   System.out.println("Third Element: " + ele[2]);
	   System.out.println("Fourth Element: " + ele[3]);
	   System.out.println("Fifth Element: " + ele[4]);
	 }*/
		System.out.println("enter the size of elements");
		Scanner sc  = new Scanner(System.in);
				int n= sc.nextInt();
				int[] arr=new int[n];
		System.out.println("enter" + n + "elements into array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}	
		
		System.out.println("Trversing through array");
		for(int i=0;i<n;i++)
		{
		  System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("printing in reverse order");
		for(int i=n-1;i>=0;i--)
		{
			 System.out.print(arr[i]+" ");
		}
	
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum"+sum);
		
		
	}

	public static void main(String[] args) {
		arrays obj= new arrays();
		obj.a1();
		
	

	}

}
