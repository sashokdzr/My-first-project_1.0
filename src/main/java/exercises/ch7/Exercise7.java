package exercises.ch7;

import java.security.SecureRandom;

public class Exercise7 {
    int length = 10;
    int[] arr = new int[length];

    public void NewArr() {
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9);
        }
    }

    public void display() {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public void display1(int add) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + add + " ");
        }
    }

    public void display2() {
        System.out.println("Best elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }
    }
}

