package day14;

public class string {
    public static void main(String[] args){
        String s = "Parul";
        String s1 = "Parul";
        String s2 = "Bhupal";
        String v=new String("Parul");
        String v1=new String("Parul");
        System.out.println(s1==s2);
        System.out.println(s2==v);
        System.out.println(v==v1);
        System.out.println(v1.equals(v));


    }
    
}
