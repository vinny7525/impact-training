package day10;

import java.util.Scanner;

public class secondmaximumelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println("There is no second maximum element.");
            return;
        }

        int[] arr = new int[num];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (value > secondMax && value < max) {
                secondMax = value;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element.");
        } else {
            System.out.println("The second maximum element in the array is: " + secondMax);
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
