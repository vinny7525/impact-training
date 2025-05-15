package day9;
import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        int number = decimal;
       int remainder = 0;
        int place=1;
        int rev=0;

        if (decimal == 0) {
           rev=0;
        } else if (decimal == 1) {
            rev=1;
        } else {
            while (decimal > 0) {
                remainder = decimal % 2;
                rev=rev+remainder*place;
                place=place*10;
                decimal = decimal / 2;
            }
        }

        System.out.println("Binary of " + number + " is: " + rev);
    }


}
