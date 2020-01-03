package exercises.ch4;

import java.util.Scanner;

public class SalesComission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Item");
        int item = input.nextInt();
        double wholeSalary = 0;
        while (item != -1) {
            System.out.println("Value: ");
            double value = input.nextDouble();
            double itemSalary = value * 9 / 100;
            wholeSalary += itemSalary;
            System.out.println("Item");
            item = input.nextInt();
        }
        System.out.printf("Your month Salary equal %.2f $", wholeSalary + 200);
    }

}
