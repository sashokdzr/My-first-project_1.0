package exercises.ch4;

import java.util.Scanner;

public class DunglingElseProblemTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input X and Y");
        int k = input.nextInt();
        int l = input.nextInt();
        DunglingElseProblem test = new DunglingElseProblem();
        test.forXY1(k, l);
        System.out.println();
        test.forXY2(k, l);
        System.out.println();
        test.forXY3(k, l);
        System.out.println();
        test.forXY4(k, l);
    }
}
