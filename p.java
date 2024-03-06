package AJPJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class p {
	private int i;

	void a1() {
		int[ ]a= { 10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		System.out.println("Array length:"+ a.length);
		System.out.println("Accessing elements of array");

		System.out.println("the 1 element: "+a[0]);
		System.out.println("the 2 element: "+a[1]);
		System.out.println("the 3 element: "+a[2]);
		System.out.println("the 4 element: "+a[3]);
		System.out.println("the 5 element: "+a[4]);
		
	}
	void a2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" elements into array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.println("traversing method");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("the reverse order is:");
			for(int i=n-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
	
		System.out.println();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
			System.out.println("sum of the array:" +sum);

}

	
	public static void main(String[] args) {
		p obj = new p();
		obj.a1();
		obj.a2();
		
	}

}
