package exercises.ch4;

import java.util.Scanner;

public class exercise_4_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        compare(x, y);
    }

    public static void compare(double k, double l) {
        if (k < 10) {
            if (l > 10) {
                System.out.println("*****");
            }
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

    }
}