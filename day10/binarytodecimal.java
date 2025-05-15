
 import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = scanner.nextInt();
        int number = binary;
        int decimal = 0;
        int base = 1; 

        while (binary > 0) {
            int lastDigit = binary % 10;
            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid binary number.");
                return;
            }
            decimal = decimal + lastDigit * base;
            base = base * 2;
            binary = binary / 10;
        }

        System.out.println("Decimal of " + number + " is: " + decimal);
    }

}
