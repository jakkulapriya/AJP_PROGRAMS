package AJPJAVA;

import java.util.Scanner;

public class MaxElement {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Prompt user to enter the size of the array
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        // Create the array
		        int[] array = new int[size];

		        // Prompt user to enter the elements of the array
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        // Find the maximum element
		        int max = array[0];
		        for (int i = 1; i < size; i++) {
		            if (array[i] > max) {
		                max = array[i];
		            }
		        }

		        // Display the maximum element
		        System.out.println("Maximum element in the array: " + max);

		        scanner.close(); // Close the scanner
		    }
		}


	


