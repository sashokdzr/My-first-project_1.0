import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int count1;
        System.out.print("The first number:");
        number1 = input.nextInt();
        System.out.print("The second number:");
        number2 = input.nextInt();
        count1 = number1 + number2;
        System.out.printf("Summa chisel: %d%n", count1);
    }
}
