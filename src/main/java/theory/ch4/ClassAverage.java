package theory.ch4;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int student = 1;
        double average = 0;
        while (student <= 10) {
            System.out.printf("Value%s=", student);
            int grade = input.nextInt();
            if (grade >= 100 || grade < 0) {
                System.out.println("Wrong value");
                break;
            }
            average = average + grade;
            student += 1;
        }
        double result = average / student;
        System.out.printf("result=%.2f", result);
    }
}
