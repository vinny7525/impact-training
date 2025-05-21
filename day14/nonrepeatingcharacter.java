package day14;

public class nonrepeatingcharacter {
    
    public static void main(String[] args) {
        String s = "zaazbcd";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(s.lastIndexOf(ch) == s.indexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
            
        }

        System.out.println("No non-repeating character found.");
    }
}
    

