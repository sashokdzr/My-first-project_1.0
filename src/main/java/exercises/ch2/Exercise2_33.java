package exercises.ch2;

import java.util.Scanner;

public class Exercise2_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weightInKilograms;
        double bmi = 0;
        double heightInMeters = 1;
        System.out.print("input your weight in kilograms:");
        weightInKilograms = input.nextInt();
        System.out.print("input your height in meters:");
        heightInMeters = input.nextDouble();
        bmi = weightInKilograms / (heightInMeters * heightInMeters);
        if (bmi < 18.5)
            System.out.println("Underweight");
        if (bmi >= 18.5 && bmi <= 24.9)
            System.out.println("Normal");
        if (bmi >= 25 && bmi <= 29.9)
            System.out.println("Overweight");
        if (bmi >= 30)
            System.out.println("Obese");

    }
}
