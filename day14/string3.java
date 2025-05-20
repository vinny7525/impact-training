package day14;

public class string3 {
    public static void main(String[]args){
        String s= "University";
        System.out.println(s.concat(" parul"));
        StringBuilder sb= new StringBuilder(s);
       
        System.out.println(sb.append('s').toString());
         System.out.println(sb.delete(0,3));
    }
    
}
