package exercise2;

import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		String tryAgain = "y";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonacci Sequence");
		
		do {
			System.out.println("Please enter the range");
			int range = scanner.nextInt();
			int firstNum = 0;
			int secondNum = 1;
			
			for(int i = 1; i <= range; i++) {
				int nextNum = firstNum + secondNum;
				System.out.println(nextNum + " ");
				firstNum = secondNum;
				secondNum = nextNum;
			}
			System.out.println("\nTry again? enter \"'y' or 'n'\".");
			tryAgain = scanner.next();
		}while(!tryAgain.equalsIgnoreCase("n"));
		scanner.close();
	}
}

