package day9;
import java.util.Scanner;
public class decimaltobinary {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        int number = decimal;
        String binary = "";

        if (decimal == 0) {
            binary = "0";
        } else {
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary = remainder + binary;  // prepend the bit
                decimal = decimal / 2;
            }
        }

        System.out.println("Binary of " + number + " is: " + binary);
    }


}
