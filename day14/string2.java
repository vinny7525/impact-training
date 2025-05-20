package day14;

import java.util.Scanner;

public class string2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the character to be searched");
        char tar=sc.next().charAt(0);
        int count=0;    
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==tar){
                count++;
            }
        }

        System.out.println("The character "+tar+" is present "+count+" times in the string "+s);
        System.out.println("The length of the string is "+s.length());
    }
}
