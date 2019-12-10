package exercises;

import java.util.Scanner;

public class Exercise2_8 {
    public static void main(String[] args) {
        System.out.print("Enter an integer 'a':");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Enter an integer 'b':");
        int b = input.nextInt();
        int c = a * b;
        System.out.printf("%s%d","Result=", c);
    }
}
