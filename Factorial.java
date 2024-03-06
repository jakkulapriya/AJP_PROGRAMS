package AJPJAVA;


	
		import java.util.Scanner;

		public class Factorial {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Prompt user to enter a number
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        // Calculate factorial
		        long factorial = calculateFactorial(number);

		        // Display the factorial
		        System.out.println("Factorial of " + number + " is: " + factorial);

		        scanner.close(); // Close the scanner
		    }

		    // Method to calculate factorial recursively
		    public static long calculateFactorial(int n) {
		        if (n == 0 || n == 1) {
		            return 1;
		        } else {
		            return n * calculateFactorial(n - 1);
		        }
		    }
		


	}


