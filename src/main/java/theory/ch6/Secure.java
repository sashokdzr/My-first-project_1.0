package theory.ch6;

import java.util.Random;

public class Secure {

    public static void main(String[] args) {
        int k = 0;
        int t = 0;
        Random test = new Random();
        for (int i = 1; i < 101; i++) {
            int a = 1 + test.nextInt(99);
            System.out.print(a + " ");
            if (a % 2 == 0) k += 1;
            else
                t += 1;
        }
        System.out.println();
        System.out.println("Even: " + k);
        System.out.println("Odd: " + t);
    }
}
