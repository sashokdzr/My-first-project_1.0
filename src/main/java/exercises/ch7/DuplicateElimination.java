package exercises.ch7;

import java.util.Scanner;

public class DuplicateElimination {
    int len = 5;
    int[] arr = new int[len];

    public void mass() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int k = input.nextInt();
            if (k >= 10 && k <= 100) {
                arr[i] = k;
            } else {
                System.out.println("worst case");
                i--;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }
}
