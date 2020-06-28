package exercises.ch2;

import java.util.Scanner;

public class Exercise2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;
        System.out.print("Enter raduis: ");
        int r = input.nextInt();
        System.out.printf("%s%d%n%s%f%n%s%f%n", "diameter=", 2 * r, "circumference=", 2 * pi * r, "area=", pi * r * r);

    }
}
