package exercises.ch4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input account number: ");
        int accNumber = input.nextInt();
        while (accNumber > 0) {
            System.out.println("Beginning balance: ");
            int beginningBalance = input.nextInt();
            System.out.println("Charges: ");
            int charges = input.nextInt();
            System.out.println("Credits: ");
            int credits = input.nextInt();
            System.out.println("Limit: ");
            int creditLimit = input.nextInt();
            int newBalance = beginningBalance + charges - credits;
            if (newBalance >= creditLimit)
                System.out.printf("You can use %d BLR %n", newBalance - creditLimit);
            else
                System.out.println("Credit limit exceeded");
            --accNumber;
        }
    }
}
