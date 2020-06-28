package exercises.ch3;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a month: ");
        int m = input.nextInt();
        System.out.println("Input a day: ");
        int d = input.nextInt();
        System.out.println("Input a year: ");
        int y = input.nextInt();
        Date cdate1 = new Date(m, d, y);
        cdate1.displayDate(d, m, y);
    }

}
