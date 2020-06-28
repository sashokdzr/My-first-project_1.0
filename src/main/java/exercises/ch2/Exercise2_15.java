package exercises.ch2;

import java.util.Scanner;

public class Exercise2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First");
        int x = input.nextInt();
        System.out.println("Second");
        int y = input.nextInt();
        System.out.printf("%S%d%n", "sum=", x + y);
        System.out.printf("%s%d%n", "difference=", x - y);
        System.out.printf("%s%d%n", "product=", x * y);
        System.out.printf("%s%d%n", "division=", x % y);
        if (x > y)
            System.out.printf("%d%s%n", x, " is larger");
        if (y > x)
            System.out.printf("%d%s%n", y, " is larger");
        if (x == y)
            System.out.println("These numbers are equal");

    }
}
