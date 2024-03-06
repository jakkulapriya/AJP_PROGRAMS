package AJPJAVA;



	
		import java.util.Scanner;

		public class PalindromeCheck {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Prompt user to enter a string
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        // Check if the input string is a palindrome
		        boolean isPalindrome = checkPalindrome(input);

		        // Display the result
		        if (isPalindrome) {
		            System.out.println("The string \"" + input + "\" is a palindrome.");
		        } else {
		            System.out.println("The string \"" + input + "\" is not a palindrome.");
		        }

		        scanner.close(); // Close the scanner
		    }

		    // Method to check if a string is palindrome
		    public static boolean checkPalindrome(String str) {
		        int length = str.length();
		        for (int i = 0; i < length / 2; i++) {
		            if (str.charAt(i) != str.charAt(length - 1 - i)) {
		                return false;
		            }
		        }
		        return true;
		    }
		}

	


