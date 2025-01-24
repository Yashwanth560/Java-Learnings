import java.util.Scanner;

public class RestaurantMenuOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "Menu:\n1. Pizza - $10\n2. Burger - $7\n3. Pasta - $8\n4. Exit\n";
        double totalCost = 0;

        while (true) {
            System.out.println(menu);
            System.out.print("Choose an item by entering its number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalCost += 10;
                    System.out.println("Pizza added to your order.");
                    break;
                case 2:
                    totalCost += 7;
                    System.out.println("Burger added to your order.");
                    break;
                case 3:
                    totalCost += 8;
                    System.out.println("Pasta added to your order.");
                    break;
                case 4:
                    System.out.println("Thank you for ordering! Your total cost is: $" + totalCost);
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
