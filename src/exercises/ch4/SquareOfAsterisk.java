package exercises.ch4;

public class SquareOfAsterisk {
    public void side(int i) {
        if ((i > 0) && (i < 21)) {
            int k = 0;
            while (k < i) {
                int l = 0;
                while (l < i) {
                    if ((k == 0) || (l == 0) || (l == i - 1) || (k == i - 1)) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                    l++;
                }
                k++;
                System.out.println();

            }

        }

    }
}
