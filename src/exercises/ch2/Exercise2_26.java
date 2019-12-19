package exercises.ch2;

import java.util.Scanner;

public class Exercise2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x % y == 0)
            System.out.println("Yes");
        if (x % y != 0)
            System.out.println("No");
    }
}
