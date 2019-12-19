package exercises.ch2;

import java.util.Scanner;
public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int value;
        System.out.println("Input the value:");
        value = input.nextInt();
        System.out.printf("%s%n%s%n", "This is Java", "Program");
        if (value!=7)
            System.out.println("The value !=7!");
        if (value>7)
            System.out.println("Value>7");
        if (value<7)
            System.out.println("Value <7");
        int a=5;
        int b=6;
        int c=7;
        int d=a+b+c;
        System.out.println(d);
    }
}
