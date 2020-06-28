package theory.ch5;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int value;
        do {
            value = input.nextInt();
            switch (value % 2) {
                case 0:
                    System.out.println("Even");
                    break;
                case 1:
                    System.out.println("Odd");
            }
        }
        while (value != 0);

    }
}
