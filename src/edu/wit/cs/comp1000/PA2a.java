package edu.wit.cs.comp1000;
import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		int num_1;
		int num_2;
		int num_3;
		int num_4;
		int num_5;
		int sumPos = 0;
		int sumNeg = 0;
		int sumAll;
		double averagePos;
		double posCount = 0.0;
		double averageNeg;
		double negCount = 0.0;
		double averageAll;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter five whole numbers: ");
		num_1 = input.nextInt();
		num_2 = input.nextInt();
		num_3 = input.nextInt();
		num_4 = input.nextInt();
		num_5 = input.nextInt();
		
		sumAll = num_1 + num_2 + num_3 + num_4 + num_5;
		
		averageAll = sumAll/5.0;
		
		if (num_1 > 0) {
			posCount++;
			sumPos += num_1;
		}
		else {
			negCount ++;
			sumNeg += num_1;
		}
		
		if (num_2 > 0) {
			posCount++;
			sumPos += num_2;
		}
		else {
			negCount ++;
			sumNeg += num_2;
		}
		
		if (num_3 > 0) {
			posCount++;
			sumPos += num_3;
		}
		else {
			negCount ++;
			sumNeg += num_3;
		}
		
		if (num_4 > 0) {
			posCount++;
			sumPos += num_4;
		}
		else {
			negCount ++;
			sumNeg += num_4;
		}
		
		if (num_5 > 0) {
			posCount++;
			sumPos += num_5;
		}
		else {
			negCount ++;
			sumNeg += num_5;
		}
		
		averagePos = sumPos/posCount;
		averageNeg = sumNeg/negCount;
		
		if (posCount == 1) {
			System.out.printf("The sum of the %.0f positive number: %d%n", posCount, sumPos);			
		}
		else {
			System.out.printf("The sum of the %.0f positive numbers: %d%n", posCount, sumPos);
		}
		
		if (negCount == 1) {
			System.out.printf("The sum of the %.0f non-positive number: %d%n", negCount, sumNeg);
		}
		else {
			System.out.printf("The sum of the %.0f non-positive numbers: %d%n", negCount, sumNeg);
		}
		
		System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
		
		if (posCount == 1) {
			System.out.printf("The average of the %.0f positive number: %.2f%n", posCount, averagePos);
		}
		else if (posCount == 0) {
			System.out.printf("The average of the 0 positive numbers: 0.00%n");
		}
		else {
			System.out.printf("The average of the %.0f positive numbers: %.2f%n", posCount, averagePos);
		}
		
		if (negCount == 1) {
			System.out.printf("The average of the %.0f non-positive number: %.2f%n", negCount, averageNeg);
		}
		else if (negCount == 0) {
			System.out.printf("The average of the 0 non-positive numbers: 0.00%n");
		}
		else {
			System.out.printf("The average of the %.0f non-positive numbers: %.2f%n", negCount, averageNeg);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n", averageAll);
	}

}
