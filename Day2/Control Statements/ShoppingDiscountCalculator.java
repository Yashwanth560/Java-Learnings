import java.util.Scanner;

public class ShoppingDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total amount: ");
        double total = scanner.nextDouble();
        double discount = 0;

        if (total > 500) {  
            discount = total * 0.10;
        } else if (total >= 200 && total <= 500) {
            discount = total * 0.05;
        }

        double finalAmount = total - discount;
        System.out.println("Discount: $" + discount);
        System.out.println("Final Amount: $" + finalAmount);
        scanner.close();
    }
}
