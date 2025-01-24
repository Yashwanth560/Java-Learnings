import java.util.Scanner;

public class ProductStockChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        for (int i = 1; i <= numProducts; i++) {
            System.out.print("Enter the stock for Product " + i + ": ");
            int stock = scanner.nextInt();

            if (stock < 10) {
                System.out.println("Product " + i + " is low on stock. Reorder needed.");
            } else {
                System.out.println("Product " + i + " stock is sufficient.");
            }
        }

        scanner.close();
    }
}
