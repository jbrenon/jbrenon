package exercise1;

import java.util.Scanner;

public class PythagorianTheorem {
	public static void main(String[] args) {
		String tryAgain = "y";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pythagorean Theorem");
		
		do {
		System.out.println("Enter the Opposite side of the triangle");
		double opposite = scanner.nextDouble();
		opposite = opposite * opposite;
		
		System.out.println("Enter the Adjacent side of the triangle");
		double adjacent = scanner.nextDouble();
		adjacent = adjacent * adjacent;
		System.out.println(adjacent);
		
		double hypotenuse = adjacent + opposite;
		double sqrHypotenuse = Math.sqrt(hypotenuse);
		System.out.printf("%.2f", sqrHypotenuse);
		System.out.println("");
		System.out.println("Try again? enter \"y or n\".");
		tryAgain = scanner.next();
		
		}while(!tryAgain.equalsIgnoreCase("n"));
		System.out.println("You are done");
		scanner.close();
	}
}

