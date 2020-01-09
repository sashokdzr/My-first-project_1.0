package exercises.ch4;

import java.util.Scanner;

public class FindLargeNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 10;
        System.out.println("Input the number: ");
        FindTheLargeNumber num = new FindTheLargeNumber(0, input.nextInt());
        while (i > 0) {
            System.out.println("Input the number: ");
            FindTheLargeNumber num1 = new FindTheLargeNumber(num.getLargestNumber(), input.nextInt());
            System.out.printf("%d %d %n", num.getLargestNumber(), num.largeNumber());
            i--;
        }

    }
}
