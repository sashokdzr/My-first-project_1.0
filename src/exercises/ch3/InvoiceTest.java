package exercises.ch3;

import java.io.PrintStream;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice line1 = new Invoice("1", "books", 124, 2.334);
        Invoice line2 = new Invoice("2", "pens", 5, 1.2);
        System.out.printf("%s: %s with item %d and price %.2f%n", line1.getNumber(), line1.getDescription(), line1.getItem(), line1.getPricePerItem());
        System.out.printf("%s: %s with item %d and price %.2f%n%n", line2.getNumber(), line2.getDescription(), line2.getItem(), line2.getPricePerItem());

        System.out.printf("Multiple for %s line for %s = %.2f%n%n", line1.getNumber(), line1.getDescription(), line1.setInvoiceAmount());
        System.out.printf("Multiple for %s line for %s = %.2f", line2.getNumber(), line2.getDescription(), line2.setInvoiceAmount());
    }
}
