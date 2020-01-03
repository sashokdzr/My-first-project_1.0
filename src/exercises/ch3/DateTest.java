package exercises.ch3;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date1 = new Date(1, 21, 1999);
        Date date2 = new Date(3, 4, 1988);
        Date date3 = new Date(4, 5, -200);

        date1.displayDate();

        date2.displayDate();

        date3.displayDate();


    }

}
