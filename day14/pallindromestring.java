package day14;

import java.util.Scanner;

public class string3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String pallindrome="";
        char tar= s.charAt(0); ;
        for(int i=s.length()-1;i>=0;i--){
            pallindrome+=s.charAt(i);
        }
        if(s.compareToIgnoreCase(pallindrome) == 0){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
 }
}
