package exercises.ch4;

public class CheckboardPattern {
    public void printing() {
        int i = 0;
        int k;
        while (i <= 7) {
            k = 0;
            while (k <= 7) {
                System.out.print("* ");
                k++;
            }
            if (i % 2 != 0) {
                System.out.println();
            } else {
                System.out.println();
                System.out.print(" ");

            }
            i++;
        }


    }

}


