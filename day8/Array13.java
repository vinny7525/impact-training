package day8;

public class Array13 {
    public static void main(String[] args){
        

        int[] arr = {180,200,180,180,200,200,200,200};
        int person1_height = 0;
        int maximum_height = 0;
        int maximum_weight = 0;
        int person2_weight = 0;
        for(int i=0; i<arr.length; i+=2){
            if(maximum_height < arr[i]){
                maximum_height = arr[i];
                person1_height = i/2 +1;

            }
        }
        for(int j = 1; j<arr.length; j+=2){
            if(arr[j] > maximum_weight){
                maximum_weight = arr[j];
                person2_weight =j/2 +1;
            }
        }
        System.out.println(maximum_weight+ ": " +person2_weight+" "+maximum_height+ ": " +person1_height);


    }
    
}