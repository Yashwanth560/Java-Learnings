import java.util.Scanner;

public class ProductDiscountFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        for (int i = 1; i <= numProducts; i++) {
            System.out.print("Enter price for Product " + i + ": ");
            double price = scanner.nextDouble();

            System.out.print("Enter discount percentage for Product " + i + ": ");
            double discount = scanner.nextDouble();

            double discountedPrice = price - (price * discount / 100);
            System.out.println("Discounted Price for Product " + i + ": $" + discountedPrice);
        }

        scanner.close();
    }
}
