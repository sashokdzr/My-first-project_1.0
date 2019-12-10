package exercises;

import java.util.Scanner;
public class Exercise2_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("First");
        int x=input.nextInt();
        System.out.println("Second");
        int y=input.nextInt();
        System.out.println("Third");
        int z=input.nextInt();
        int result;
        System.out.printf("%s%n%d%n", "Product is:", result=z+y+z);
    }
}
