package exercises.ch5;

import java.util.Scanner;

public class DiamondPrintingProgramTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DiamondPrintingProgram a = new DiamondPrintingProgram();
        System.out.println("Input odd romb size : ");
        a.setParam(input.nextInt());
        a.print();
    }
}
