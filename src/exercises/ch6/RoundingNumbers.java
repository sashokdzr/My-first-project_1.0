package exercises.ch6;

import java.util.*;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a value");
        double x = input.nextDouble();
        int y;
        y = (int) Math.floor(x + 0.5);
        System.out.println("Original value = " + x);
        System.out.println("Rounded value = " + y);
    }
}
