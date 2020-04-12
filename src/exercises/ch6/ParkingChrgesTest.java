package exercises.ch6;

import java.util.Scanner;

public class ParkingChrgesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double k = 0;
        double sum = 0;
        do {
            System.out.println("Input time please:");
            k = input.nextDouble();
            if (k < 0 || k > 24) {
                System.out.println("System Error");
            } else {
                ParkingCharges calc = new ParkingCharges();
                double res = calc.calculateCharges(k);
                System.out.println(res);
                sum += res;
            }
        }
        while (k != -1);
        System.out.println("Yesterday's bank:" + sum + '$');
    }
}
