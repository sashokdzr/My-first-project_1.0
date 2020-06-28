package exercises.ch5;

public class Exercise18 {
    public static void main(String[] args) {
        double amount;
        int principal = 100000;
        double rate = 0.05;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            amount = principal * Math.pow(1 + rate, year);
            int camount = (int) amount;
            int cents = camount % 100;
            int dollars = camount / 100;

            System.out.printf("%4d%20d%s%d%n", year, dollars, ".", cents);
        }

    }
}
