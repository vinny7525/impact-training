package day14;

import java.util.Scanner;

public class smallestcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();  // normalize to lowercase

        boolean[] present = new boolean[26];  // For 'a' to 'z'

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                System.out.println("Smallest missing character: " + (char)(i + 'a'));
                return;
            }
        }

        System.out.println("All characters from a to z are present.");
    }
}