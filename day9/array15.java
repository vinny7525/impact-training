package day9;

import java.util.Scanner;

public class array15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            for (int j = num-1; j > i; j--) {
                if (arr[j] % 2 == 0 && arr[i] % 2 != 0) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        } System.out.print( "Elements after shuffling:");
        for (int k = 0; k < num; k++) {
            System.out.print( +arr[k] + " ");
        }
        sc.close();
    }
}