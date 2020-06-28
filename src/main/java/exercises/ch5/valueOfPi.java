package exercises.ch5;

public class valueOfPi {
    protected double result() {
        float pi = 0;
        {
            for (double i = 1; i <= 20000; i += 4) {
                pi += 4 / i;
            }
            for (double j = 3; j <= 20000; j += 4) {
                pi -= (4 / j);
            }
            return (pi);
        }
    }
}
