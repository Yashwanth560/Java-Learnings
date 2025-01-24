import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter element to search for: ");
        int searchElement = scanner.nextInt();
        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == searchElement) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at position " + (position + 1));
        } else {
            System.out.println("Element not found.");
        }
    }
}
