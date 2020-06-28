package exercises.ch4;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("n  n*10  n*100 n*1000");
        for (double i = 1; i < 11; i++) {
            for (double j = 0; j < 4; j++) {
                System.out.printf("%.0f", i * Math.pow(10, j));
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}