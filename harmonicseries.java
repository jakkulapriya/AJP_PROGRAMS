package AJPJAVA;

import java.util.Scanner;

public class harmonicseries {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the value of n: ");		     
		        int n = scanner.nextInt();		        
		        displayHarmonicSeries(n);
		    }
		    static void displayHarmonicSeries(int n) {		    
		    	double sum = 0.0;
		  
		        System.out.print("Harmonic Series: ");		     
		        for (int i = 1; i <= n; i++) {
		            System.out.print("1/" + i);
		            sum += 1.0 / i;

	            if (i < n) {
		                System.out.print(" + ");
		            }
		        }

        System.out.println("\nSum of Harmonic Series: " + sum);
    }
}

