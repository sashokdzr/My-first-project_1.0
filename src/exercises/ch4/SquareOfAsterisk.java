package exercises.ch4;

public class SquareOfAsterisk {
    public void side(int i) {
        if ((i > 0) && (i < 21)) {
            int k = 0;
            while (k < i) {
                if ((k > 1) && (k <= i)) {
                    System.out.println();
                    k++;
                    int l = 0;
                    while (l < i) {
                        System.out.print(" * ");
                        l++;
                    }
                } else {
                    System.out.println();
                    k++;
                    int l = 0;
                    while (l < i) {
                        System.out.print("   ");
                        l++;
                    }
                }
            }

        }
    }
}
