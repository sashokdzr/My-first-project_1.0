package exercises;

import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = (a + b + c) / 3;
        System.out.printf("%s%d%n", "sum= ", a + b + c);
        System.out.printf("%s%d%n", "average= ", d);
        System.out.printf("%s%d%n", "product= ", a * b * c);
        if ((a > b) & (a > c)) //find largest element
            System.out.printf("%d%s%n", a, " is largest");
        if ((b > a) & (b > c))
            System.out.printf("%d%s%n", b, " is largest");
        if ((c > a) & (c > b))
            System.out.printf("%d%s%n", c, " is largest");
        if ((a < b) & (a < c)) //find smallest element
            System.out.printf("%d%s%n", a, " is smallest");
        if ((b < a) & (b < c))
            System.out.printf("%d%s%n", b, " is smallest");
        if ((c < a) & (c < b))
            System.out.printf("$d$s$n", c, " is smallest");

    }
}
