package exercises.ch4;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 1 or 2");
        int number = input.nextInt();
        while (number != 1 && number != 2) {
            System.out.println("Input 1 or 2");
            number = input.nextInt();
        }
        System.out.printf("Successfully: %d", number);
    }
}
