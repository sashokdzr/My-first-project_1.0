package exercises.ch4;

import java.util.Scanner;

public class FindTwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -1000;
        int prevMax = -1000;
        int number;
        for (int i = 1; i < 11; i++) {
            System.out.print("Input the number ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            } else {
                if (number > prevMax) {
                    prevMax = number;
                }
            }
        }
        System.out.printf("max number: %d , previous max number: %d", max, prevMax);

    }
}
