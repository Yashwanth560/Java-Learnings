import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Ascending order: " + Arrays.toString(arr));

        int[] descArr = new int[n];
        for (int i = 0; i < n; i++) {
            descArr[i] = arr[n - 1 - i];
        }
        System.out.println("Descending order: " + Arrays.toString(descArr));
    }
}
