package exercises.ch3;

public class Exercise_3_15 {
    private String name;
    private double balance;

    public Exercise_3_15(String name, double balance) {
        this.name = name;
        if (balance > 0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0)
            balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayAccount(String name, double balance) {
        System.out.printf("%s balance: $%.2f%n", name, balance);
    }
}