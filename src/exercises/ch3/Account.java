package exercises.ch3;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance)
            System.out.println("Withdraw amount exceed account balance");
        if (withdrawAmount <= balance)
            balance = balance - withdrawAmount;

    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
