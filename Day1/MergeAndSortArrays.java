import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter number of elements in second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] mergedArray = new int[n1 + n2];
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        System.arraycopy(arr2, 0, mergedArray, n1, n2);

        Arrays.sort(mergedArray);
        System.out.println("Merged and sorted array:");
        System.out.println(Arrays.toString(mergedArray));
    }
}
