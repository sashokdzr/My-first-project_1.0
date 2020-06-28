package exercises.ch4;

import java.util.Scanner;

public class TheLargestNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers are you comparing?");
        int i = input.nextInt();
        double res = 0;
        int number;
        double k = 0;
        for (int j = 1; j <= i; j++) {
            System.out.printf("Input int %d: ", j);
            number = input.nextInt();
            res = compare(res, number);
        }
        System.out.printf("The largest number is: %d%n", (int) res);
    }
    //public static double result(double a){
    //    for (a = 1 ; a<=
    //}

    public static double compare(double k, double j) {
        if (j >= k) {
            k = j;
        }
        return k;
    }

}
