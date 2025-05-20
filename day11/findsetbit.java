package day11;

public class findsetbit {
    public static void main(String[] args) {
        int value = 0b10111;       
        int position = 3;     

        
        int mask = 1 << position;

        
        if ((value & mask) != 0) {
            System.out.println("Bit at position " + position + " is set.");
        } else {
            System.out.println("Bit at position " + position + " is not set.");
        }
    }
}

