package AJPJAVA;

import java.util.Scanner;


public class scannerclass {
	void s1() {
	
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n= sc.nextInt();
//		System.out.println("the given number is:" +n);	
//		
//		
//		System.out.println("enter a number");
//		byte b= sc.nextByte();
//		System.out.println("the given number is:" +b);	
//		
//		System.out.println("string name is");
//		String s1= sc.next();
//		System.out.println("the string is:" +s1);
//		
		System.out.println("character name is");
		char c1= sc.next().charAt(0);
		System.out.println("char is: " +c1 );
	}
	
	


	public static void main(String[] args) {
		scannerclass obj = new scannerclass();
		obj.s1();
		
	}
	}




