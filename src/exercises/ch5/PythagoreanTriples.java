package exercises.ch5;

public class PythagoreanTriples {
    void findPythagor() {
        int iteration = 0;
        int counter = 0;
        int i;
        int j;
        int k;
        for (i = 1; i <= 500; i++) {
            for (j = 1; j <= 500; j++) {
                for (k = 1; k <= 500; k++) {
                    iteration++;
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                        if (i < k + j && k < i + j && j < k + i) {
                            counter++;
                            System.out.printf("%s%d ,%s%d ,%s%d %n", "Side1 = ", i, "Side2 = ", j, "Side3 = ", k);
                        }
                    }
                }
            }
        }
        System.out.println("Amount of triangle " + counter);
        System.out.println("Iteration " + iteration);
    }
}
