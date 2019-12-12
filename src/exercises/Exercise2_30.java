package exercises;

import java.util.Scanner;

public class Exercise2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chislo");
        int d = input.nextInt();
        if ((d / 100000 < 10) & (d / 100000 > 0))
            System.out.printf("%d   %d   %d   %d   %d   %d", d % 1000000 / 100000, d % 100000 / 10000, d % 10000 / 1000, d % 1000 / 100, d % 100 / 10, d % 10);
        if ((d / 10000 < 10) & (d / 10000 > 0))
            System.out.printf("%d   %d   %d   %d   %d", d % 100000 / 10000, d % 10000 / 1000, d % 1000 / 100, d % 100 / 10, d % 10);
        if ((d / 1000 < 10) & (d / 1000 > 0))
            System.out.printf("%d   %d   %d   %d", d % 10000 / 1000, d % 1000 / 100, d % 100 / 10, d % 10);
    }
}
