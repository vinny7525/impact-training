import java.util.*;

public class insertionarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array1: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Position to add the element in array (0 to " + n + "):");
        int p = sc.nextInt();

        if (p < 0 || p > n) {
            System.out.println("Invalid position!");
            return;
        }

        System.out.println("Element to add in array:");
        int e = sc.nextInt();

        int newArr[] = new int[n + 1];

        for (int i = 0; i < p; i++) {
            newArr[i] = arr[i];
        }

        newArr[p] = e;

        for (int i = p; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array after adding the element:");
        for (int i = 0; i <= n; i++) {
            System.out.println(newArr[i]);
        }
    }
}
