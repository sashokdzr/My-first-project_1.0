package exercises.ch2;

import java.util.Scanner;

public class Exercise2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = x % 2;
        if (y == 0)
            System.out.println("Even");
        if (y == 1)
            System.out.println("Odd");
    }
}
