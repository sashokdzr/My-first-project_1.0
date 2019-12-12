package exercises;

import java.util.Scanner;

public class Exercise2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1:");
        int a = input.nextInt();
        System.out.print("2:");
        int b = input.nextInt();
        System.out.print("3:");
        int c = input.nextInt();
        System.out.print("4:");
        int d = input.nextInt();
        System.out.print("5:");
        int e = input.nextInt();
        String odd = "Odd numbers: ";
        String even = "Even numbers: ";
        String zero = "Zero numbers: ";
        int o = 0;
        int ev = 0;
        int z = 0;
        //checking veriable a
        if ((a % 2 == 0) & (a != 0))
            ev = ev + 1; //counter
        if (a % 2 != 0)
            o = o + 1; //counter
        if (a == 0)
            z = z + 1; //counter
        //checking veriable b
        if ((b % 2 == 0) & (b != 0))
            ev = ev + 1; //counter
        if (b % 2 != 0)
            o = o + 1; //counter
        if (b == 0)
            z = z + 1; //counter
        //checking veriable c
        if ((c % 2 == 0) & (c != 0))
            ev = ev + 1; //counter
        if (c % 2 != 0)
            o = o + 1; //counter
        if (c == 0)
            z = z + 1; //counter
        //checking veriable d
        if ((d % 2 == 0) & (d != 0))
            ev = ev + 1; //counter
        if (d % 2 != 0)
            o = o + 1; //counter
        if (d == 0)
            z = z + 1; //counter
        //checking veriable e
        if ((e % 2 == 0) & (e != 0))
            ev = ev + 1; //counter
        if (e % 2 != 0)
            o = o + 1; //counter
        if (e == 0)
            z = z + 1; //counter
        System.out.printf("%s%n%s%n%s%n", even + ev, odd + o, zero + z);

    }
}
