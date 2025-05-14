package day8;

import java.util.Scanner;
public class Array16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int j=0; j<num; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        int missimgno= ++max;
        System.out.println("Smallest positive missing int: " + missimgno);
    }
    
}