package exercises.ch6;

import java.util.*;

public class RoundingNumbers1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input double number:");
        double number = input.nextDouble();
        System.out.println("Original value = " + number);
        System.out.println(RoundingNumbers1.roundToInteger(number));
        System.out.println(RoundingNumbers1.roundToTenths(number));
        System.out.println(RoundingNumbers1.roundToHundredths(number));
        System.out.println(RoundingNumbers1.roundToThousands(number));
    }

}
