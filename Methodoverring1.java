package AJPJAVA;

public class Methodoverring1 extends MethodOverriding{
	void payment(int amount, int price) {
		System.out.println("method:"+(amount+price+50));
	}
	void m1(int a, int b) {
		System.out.println("methodoverriding1:"+(a+b));
	}
	public static void main(String[] args) {
		MethodOverriding obj = new Methodoverring1();
		obj.m1(10,20);
		obj.payment(1000,100);
				
	}
	}
	

	


