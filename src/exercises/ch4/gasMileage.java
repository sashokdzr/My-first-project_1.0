package exercises.ch4;

import java.util.Scanner;

public class gasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles;
        int gallon;
        int resMiles = 0;
        int resGallon = 0;
        int number = 0;
        System.out.println("input miles");
        miles = input.nextInt();
        while (miles != -1) {
            System.out.println("Input gallons");
            gallon = input.nextInt();
            System.out.printf("Miles per gallon for  trip number %d = %f.2%n", number, (double) miles / gallon);
            number += 1;
            resMiles = resMiles + miles;
            resGallon = resGallon + gallon;
            System.out.println("input miles");
            miles = input.nextInt();
        }
        System.out.printf("All (%d) trips : %f", number, (double) resMiles / resGallon);

    }

}
