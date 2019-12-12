package exercises;

import java.util.Scanner;

public class Exercise2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        if ((x > y) & (x > z) & (x > j) & (x > k))
            System.out.printf("%d%s%n", x, " is the largest element");
        if ((y > x) & (y > z) & (y > j) & (y > k))
            System.out.printf("%d%s%n", y, " is the largest element");
        if ((z > y) & (z > x) & (z > j) & (z > k))
            System.out.printf("%d%s%n", z, " is the largest element");
        if ((j > y) & (j > z) & (j > x) & (j > k))
            System.out.printf("%d%s%n", j, " is the largest element");
        if ((k > y) & (k > z) & (k > j) & (k > x))
            System.out.printf("%d%s%n", k, " is the largest element");
        if ((x < y) & (x < z) & (x < j) & (x < k))
            System.out.printf("%d%s%n", x, " is the smallest element");
        if ((y < x) & (y < z) & (y < j) & (y < k))
            System.out.printf("%d%s%n", y, " is the smallest element");
        if ((z < y) & (z < x) & (z < j) & (z < k))
            System.out.printf("%d%s%n", z, " is the smallest element");
        if ((j < y) & (j < z) & (j < x) & (j < k))
            System.out.printf("%d%s%n", j, " is the smallest element");
        if ((k < y) & (k < z) & (k < j) & (k < x))
            System.out.printf("%d%s%n", k, " is the smallest element");
    }
}
