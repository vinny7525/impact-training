import java.util.*;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            int f=0;
            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    f=1;
                    break;
                }
            }
            
            if (f!=1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
