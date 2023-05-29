package exercise5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroceryItems {
    private static final Map<Integer, Product> products = new HashMap<>();
    private static final List<PurchaseItem> purchaseItems = new ArrayList<>();

    public static void main(String[] args) {
        initializeProducts();
        String tryAgain ="y";

        Scanner scanner = new Scanner(System.in);

        do {
        	System.out.println("Grocery Items");
            displayMenu();
            System.out.println("Select a product to purchase (0 to exit):");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 0) {
                break; // Exit the loop
            } else if (choice > 0 && choice <= products.size()) {
                selectProduct(choice, scanner);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Do you want to purchase again? Type 'y' or 'n'");
            tryAgain = scanner.next();
            
        }while(!tryAgain.equalsIgnoreCase("n"));
        System.out.println("Thank you for your purchase!");
        displayPurchaseItems();
        double totalAmount = calculateTotalAmount();
        System.out.println("Total amount: P" + totalAmount);

        scanner.close();
    }

    private static void initializeProducts() {
        products.put(1, new Product("Apple       ", 10.0, .01));
        products.put(2, new Product("Grapes      ", 15.0, .02));
        products.put(3, new Product("Sardines    ", 20.0, .04));
        products.put(4, new Product("Mango       ", 30.0, .01));
        products.put(5, new Product("Melon       ", 40.0, .02));
        products.put(6, new Product("Pineapple   ", 50.0, .04));
        products.put(7, new Product("Coconut     ", 25.0, .01));
        products.put(8, new Product("Tangerine   ", 15.0, .02));
        products.put(9, new Product("Sweet potato", 20.0, .04));
        products.put(10, new Product("Ube        ", 50.0, .05));
    }

    private static void displayMenu() {
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            int productId = entry.getKey();
            Product product = entry.getValue();
            System.out.println(productId + ". " + product.getName() + " - Price: " + product.getPrice() + " - Discount: " + product.getDiscount()*100 + "%");
        }
    }

    private static void selectProduct(int productId, Scanner scanner) {
        Product product = products.get(productId);
        System.out.print("Enter the quantity for " + product.getName() + ": ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

		PurchaseItem purchaseItem = new PurchaseItem(product, product.getPrice(), quantity, product.getDiscount());
        purchaseItems.add(purchaseItem);
        System.out.println("Added to cart!");
    }

    private static void displayPurchaseItems() {
        System.out.println("Purchased Items:");
        for (PurchaseItem item : purchaseItems) {
            System.out.println(item.getProduct().getName() + " - Price: " + item.getPrice() + " - Discount: " + item.getDiscount() + "%" + " - Quantity: " + item.getQuantity()
                    + " - Amount : P" + item.getAmount());
        }
    }

    private static double calculateTotalAmount() {
        double totalAmount = 0.0;
        for (PurchaseItem item : purchaseItems) {
            totalAmount += item.getAmount();
        }
        return totalAmount;
    }

    private static class Product {
        private final String name;
        private final double price;
        private final double discount;
        
        public Product(String name, double price, double discount) {
            this.name = name;
            this.price = price;
            this.discount = discount;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
        
        public double getDiscount() {
        	return discount;
        }
    }

    private static class PurchaseItem {
        private final Product product;
        private final double price;
        private final int quantity;
        private final double discount;

        public PurchaseItem(Product product, double price, int quantity, double discount) {
            this.product = product;
            this.price = price;
            this.quantity = quantity;
            this.discount = discount;
        }

        public Product getProduct() {
            return product;
        }
        
        public double getPrice() {
        	return price;
        }

        public int getQuantity() {
            return quantity;
        }
        
        public double getDiscount() {
        	double discount = product.getDiscount() * 100;
        	return discount;
        }

        public double getAmount() {
        	double amount = product.getPrice() * quantity;
        	double totalDiscount = amount * product.getDiscount();
        	double totalAmount = amount - totalDiscount;
            return totalAmount;
        }
    }
}

