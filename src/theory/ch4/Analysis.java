package theory.ch4;

import java.io.PrintStream;
import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int studentCounter = 1;
        while (studentCounter <= 10) {
            System.out.printf("Input 1(pass) or 2(fail) for student %d: ", studentCounter);
            int ch = input.nextInt();
            if (ch == 1)
                pass += 1;
            else
                fail += 1;
            studentCounter += 1;
        }
        if (pass >= 8)
            System.out.println("Bonus to instructor");
        else
            System.out.println("You are loser!");

    }
}
