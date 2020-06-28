package exercises.ch4;

import java.util.Scanner;

public class SquareOfAsteriskTest {
    public static void main(String[] args) {
        SquareOfAsterisk test = new SquareOfAsterisk();
        System.out.println("Input the side: ");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        test.side(p);
    }
}
