package AJPJAVA;

public class Exception {

	public static void main(String[] args) {
		try
		{
			int divideByZero = 3/ 0;
			System.out.println("exception");
			String s="java";
			System.out.println("string is null");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithematic exception"+e.getMessage());
		}
		
		finally {
			System.out.println("exception handled");
		}
;
		}
	}


