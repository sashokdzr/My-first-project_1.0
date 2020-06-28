package theory.ch4;

import java.util.Scanner;

public class sentinelAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double average = 0;
        int student = 0;
        System.out.print("Input a grade or -1 for quit ");
        double grade = input.nextDouble();
        while (grade != -1) {
            student += 1;
            average = average + grade;
            System.out.printf("%nvalue=");
            grade = input.nextDouble();
        }
        if (average == 0) {
            System.out.println("Empty");
        } else {
            double total = average / student;
            System.out.printf("Average=%s", total);

        }

    }
}