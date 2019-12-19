package exercises.ch3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jhon Travola", 20.467);
        Account account2 = new Account("Rob Nilan", 5.999);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
        Scanner input = new Scanner(System.in);

        System.out.println("Enter withdraw amount for account1:");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nRemoving %.2f from acoount1 balance%n", withdrawAmount);
        account1.withdraw(withdrawAmount);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.println("Enter withdraw amount for account2:");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nRemoving %.2f from acoount2 balance%n", withdrawAmount);
        account2.withdraw(withdrawAmount);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
    }
}
