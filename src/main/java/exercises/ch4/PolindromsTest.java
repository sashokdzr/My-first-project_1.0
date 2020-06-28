package exercises.ch4;

import java.util.Scanner;

public class PolindromsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Polindroms num = new Polindroms();
        System.out.println("Input five-digit number: ");
        int number = input.nextInt();
        num.check(number);
        num.num(number);
        num.result();


    }

}
