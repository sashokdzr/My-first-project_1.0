package exercises.ch2;

import java.util.Scanner;
public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("The first value");
        int x= input.nextInt();
        System.out.println("The second value");
        int y=input.nextInt();
        int z= x-y;
        System.out.println(z);
    }

}
