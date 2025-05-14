package day9;

import java.util.Scanner;

public class array14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // still unused
        int m = sc.nextInt();

        int onesCount = 0;
        int zeroesCount = 0;
        int otherDigits = 0;

        int temp = m;

        while (temp != 0) {
            int digit = temp % 10;

            if (digit == 1) {
                onesCount++;
            } else if (digit == 0) {
                zeroesCount++;
            } else {
                otherDigits++;
            }

            temp /= 10;
        }

        // Build the result: 1s followed by 0s
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < onesCount; i++) {
            result.append('1');
        }
        for (int i = 0; i < zeroesCount; i++) {
            result.append('0');
        }

        System.out.println("Rearranged number (1s left, 0s right): " + result.toString());
        System.out.println("Count of digits not equal to 1 or 0: " + otherDigits);

        sc.close();
    }
}
