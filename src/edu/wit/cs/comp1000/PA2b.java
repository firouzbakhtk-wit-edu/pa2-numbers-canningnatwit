package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		double a;
		double b;
		double c;
		double discriminant;
		double root1;
		double root2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		discriminant = (b*b) - (4*a*c);
		
		if (discriminant < 0) {
			System.out.printf("Roots: imaginary%n");
		}
		else if (discriminant == 0) {
			root1 = -b/(2*a);
			System.out.printf("Root: %.2f%n", root1);
		}
		else {
			root1 = (-b+Math.sqrt(discriminant))/(2*a);
			root2 = (-b-Math.sqrt(discriminant))/(2*a);
			if(root1 > root2) {
				System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
			}
			else {
				System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
			}
		}
	}

}
