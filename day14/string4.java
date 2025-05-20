package day14;

import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        String vowels = "aeiouAEIOU";
        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1){
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
        sc.close();
    }
}