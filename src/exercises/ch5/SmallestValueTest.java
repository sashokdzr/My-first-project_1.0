package exercises.ch5;

import java.util.Scanner;

public class SmallestValueTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements in arr? ");
        SmallestValue test = new SmallestValue(input.nextInt());
        System.out.println();
        System.out.printf("Elements in arr = %d", test.getFirstValue());
        System.out.println(test.enter(test.getFirstValue(), input.nextInt()));


    }
}
