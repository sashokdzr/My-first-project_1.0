package exercises.ch2;

import java.util.Scanner;

public class Exercise2_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalKilometers;
        double costGallon;
        double kmPerGallon;
        int parking;
        int tools;
        int days;
        System.out.println("Average km per day: ");
        totalKilometers = input.nextInt();
        System.out.println("Gasoline 10L cost: ");
        costGallon = input.nextDouble();
        System.out.println("Parking cost: ");
        parking = input.nextInt();
        System.out.println("Tools: ");
        tools = input.nextInt();
        System.out.println("Days: ");
        days = input.nextInt();
        double total = (totalKilometers * costGallon / 100 + parking + tools) * days;
        System.out.printf("If you use the car %d days you spend %f BLR", days, total);
    }
}
