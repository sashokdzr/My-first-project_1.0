package exercises.ch3;

import java.util.Scanner;

public class Exercise_3_15test {
    public static void main(String[] args) {
        Exercise_3_15 account1 = new Exercise_3_15("Jane Green", 50);
        Exercise_3_15 account2 = new Exercise_3_15("John Blue", -7.53);
        account1.displayAccount(account1.getName(), account1.getBalance());
        account1.displayAccount(account2.getName(), account2.getBalance());
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
        account1.displayAccount(account1.getName(), account1.getBalance());
        account1.displayAccount(account2.getName(), account2.getBalance());
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        account1.displayAccount(account1.getName(), account1.getBalance());
        account1.displayAccount(account2.getName(), account2.getBalance());

    }
}
