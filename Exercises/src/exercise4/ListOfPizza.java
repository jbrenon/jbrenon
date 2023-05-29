package exercise4;

import java.util.Scanner;

public class ListOfPizza {
	public static void main(String[] args) {
		
		String tryAgain = "y";
		System.out.println("List of Pizza");
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" Type '1' for Pepperoni Pizza" +
							   "\n Type '2' for Hawaiian Pizza" +
							   "\n Type '3' for Buffalo Pizza" +
							   "\n Type '4' for All Meat");
			System.out.println("Type the number of pizza: ");
			int number = scanner.nextInt();
			
			if(number == 1) {
				pepperoniPizza();
			}
			
			else if(number == 2) {
				hawaiianPizza();
			}
			
			else if(number == 3) {
				buffaloPizza();
			}
			
			else if(number == 4) {
				allMeat();
			}
			else {
				System.out.println("Invalid Input");
			}
			System.out.println("\nDo you want to purchase again? Type y / n");
			tryAgain = scanner.next();
		}while(!tryAgain.equalsIgnoreCase("n"));
			System.out.println("Thank you! Come again");
	}
	
	// PEPPERONI PIZZA
	private static void pepperoniPizza() {
		PepperoniPizza pepperoni = new PepperoniPizza();
		pepperoni.setNameOfPizza("Pepperoni Pizza");
		pepperoni.setShortDescription("Pepperoni Pizza is a classic pizza option and is one of the most well-loved pizzas for a reason");
		pepperoni.setPrice(12.75);
		pepperoni.setIngredients("1/2 cup of pizza sauce, 18 to 20 slices pepperoni, 12 ounces mozzarella cheese, 1/2 teaspoon ground black pepper, flour and 1 teaspoon fresh oregano");
		pepperoni.setDiscount(5);
		System.out.println("Name of Pizza: "+pepperoni.getNameOfPizza() +
						   "\nShort Description: " + pepperoni.getShortDescription() +
						   "\nPrice: " + pepperoni.getPrice() +
						   "\nIngridients: " + pepperoni.getIngredients() +
						   "\nDiscount: " + pepperoni.getDiscount());
	}
	
	// HAWAIIAN PIZZA
	private static void hawaiianPizza() {
		HawaiianPizza hawaiian = new HawaiianPizza();
		hawaiian.setNameOfPizza("Hawaiian Pizza");
		hawaiian.setShortDescription("Classic Hawaiian Pizza combines pizza sauce, cheese, cooked ham, and pineapple.");
		hawaiian.setPrice(16);
		hawaiian.setIngredients("1/2 homemade pizza dough, 1 Tablespoon olive oil, 1 Tablespoon cornmeal, 1/2 cup pizza sauce 1 and 1/2 cup of mozzarella cheese, cooked ham and bacon");
		hawaiian.setDiscount(1);
		System.out.println("Name of Pizza: "+ hawaiian.getNameOfPizza() +
						   "\nShort Description: " + hawaiian.getShortDescription() +
						   "\nPrice: " + hawaiian.getPrice() +
						   "\nIngridients: " + hawaiian.getIngredients() +
						   "\nDiscount: " + hawaiian.getDiscount());
	}
	
	// BUFFALO PIZZA
	private static void buffaloPizza() {
		BuffaloPizza buffalo = new BuffaloPizza();
		buffalo.setNameOfPizza("Buffalo Pizza");
		buffalo.setShortDescription("It is characterized by a light, fluffy, almost focaccia-like crust, a semisweet sauce, copious amounts of mozzarella cheese and exclusive use of cup and char pepperoni.");
		buffalo.setPrice(13);
		buffalo.setIngredients("1 lb. puzza dought, 4 tablespoon butter, 1/4c hot sauce, 1/2 tablespoon garlic powder, 2 shredded cooked chicken, 8oz mozzarella cheese, 1/4 red onions, and 2 green onions");
		buffalo.setDiscount(4);
		System.out.println("Name of Pizza: "+ buffalo.getNameOfPizza() +
						   "\nShort Description: " + buffalo.getShortDescription() +
						   "\nPrice: " + buffalo.getPrice() +
						   "\nIngridients: " + buffalo.getIngredients() +
						   "\nDiscount: " + buffalo.getDiscount());
	}
	
	// ALL MEAT
	private static void allMeat() {
		AllMeat allMeat = new AllMeat();
		allMeat.setNameOfPizza("All Meat");
		allMeat.setShortDescription("Homemade thin crust pizza, topped off with two types of cheese, bacon, ham, pepperoni and hot sausage! A must make for meat lovers");
		allMeat.setPrice(14.75);
		allMeat.setIngredients("1 1/4 C flour, 1/2 water, 1/4 tsp sugar, 1/2 tsp yeast, 3/4 tsp salt, 1 1/2 C mozzarella, 1/2 C ham, 1/2 C bacon, 1/4 C pepperoni slices, and ground black pepper");
		allMeat.setDiscount(3);
		
		System.out.println("Name of Pizza: "+allMeat.getNameOfPizza() +
						  "\nShort Description: "+allMeat.getShortDescription() +
						  "\nPrice: " + allMeat.getPrice() +
						  "\nIngredients: "+ allMeat.getIngredients() +
						  "\nDiscount: "+ allMeat.getDiscount());
	}
}
