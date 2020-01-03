package exercises.ch2;

import java.util.Scanner;

public class Exercise2_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input world population in thousands ");
        int worldPopulation = input.nextInt();
        System.out.print("Input growth rate per day in thousands ");
        int growthRate = input.nextInt();
        System.out.printf("World's poipulation after 1 year = %d thousands %n", worldPopulation + growthRate * 365);
        System.out.printf("World's poipulation after 2 year = %d thousands%n", worldPopulation + growthRate * 365 * 2);
        System.out.printf("World's poipulation after 3 year = %d thousands%n", worldPopulation + growthRate * 365 * 3);
        System.out.printf("World's poipulation after 4 year = %d thousands%n", worldPopulation + growthRate * 365 * 4);
        System.out.printf("World's poipulation after 5 year = %d thousands%n", worldPopulation + growthRate * 365 * 5);

    }
}
