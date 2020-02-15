package exercises.ch5;

public class Exercise3test {
    public static void main(String[] args) {
        Exercise3 param = new Exercise3();
        System.out.printf("Odd sum: %d%n", param.odd());
        System.out.println();
        System.out.printf("2.5 raised to the power 3: %.3f%n", param.raise());
        System.out.println();
        System.out.print("1 to 20: ");
        System.out.println("\t");
        param.cifer();
        System.out.println();
        System.out.print("1 to 20: ");
        System.out.println("\t");
        param.cifer1();


    }
}
