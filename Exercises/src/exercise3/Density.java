package exercise3;

import java.util.Scanner;

public class Density {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);

		String[] units = {"density", "mass", "volume"};
		double density = 0;
		double mass = 0;
		double volume = 0;
		String tryAgain = "y";
		for(int i = 1; i < units.length;) {
			do {
				System.out.println("What is missing?");
				units[i] = scanner.next();

				if(units[i].equals("density")) {
					System.out.println("Input Mass:");
					mass = scanner.nextDouble();

					System.out.println("Input Volume:");
					volume = scanner.nextDouble();

					density = mass / volume;
					System.out.println("The value of density is: " + density);
				}
					
				else if(units[i].equals("mass")) {
					System.out.println("Input Density:");
					density = scanner.nextDouble();
						
					System.out.println("Input Volume:");
					volume = scanner.nextDouble();
						
					mass = density * volume;
					System.out.println("The value of Mass is: " + mass);
				}
				
				else if(units[i].equals("volume")) {
					System.out.println("Input Mass:");
					mass = scanner.nextDouble();
					
					System.out.println("Input Density:");
					density = scanner.nextDouble();
					
					volume = mass / density;
					System.out.println("The value of Volume is: " + volume);
				}
				
				else {
					System.out.println("Invalid Unit");
				}
				
				System.out.println("Do you want to try again? Enter \"y/n\".");
				tryAgain = scanner.next();
				
			}while(!tryAgain.equals("n"));
			System.out.println("You are done!");
			scanner.close();
			break;
			
		}
	}
}