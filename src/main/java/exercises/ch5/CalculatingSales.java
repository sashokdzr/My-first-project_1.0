package exercises.ch5;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        System.out.println("Enter the product (0 to stop)");
        while (input.hasNext()) {
            int product = input.nextInt();
            switch (product) {
                case 1: {
                    p1 += 2.98;
                    break;
                }
                case 2: {
                    p2 += 4.50;
                    break;
                }
                case 3: {
                    p3 += 9.98;
                    break;
                }
                case 4: {
                    p4 += 4.49;
                    break;
                }
                case 5: {
                    p5 += 6.87;
                    break;
                }

            }
        }
        double total = p1 + p2 + p3 + p4 + p5;
        System.out.printf("Product 1: %.2f%nProduct 2: %.2f%nProduct 3: %.2f%nProduct 4: %.2f%nProduct 5: %.2f%nTotal: %.2f", p1, p2, p3, p4, p5, total);
    }

}
