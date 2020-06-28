package exercises.ch5;

public class Exercise3 {

    public int odd() {
        int sum = 0;
        for (int i = 1; i < 100; i += 2)
            sum += i;
        return sum;
    }

    public double raise() {
        double x = 2.5;
        return Math.pow(x, 3);
    }

    public void cifer() {
        int i = 1;
        while (i <= 20) {
            System.out.printf("%d ", i);
            if (i % 5 == 0)
                System.out.println();
            i++;
        }
    }

    public void cifer1() {
        for (int i = 1; i <= 20; ++i) {
            System.out.printf("%d ", i);
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

}
