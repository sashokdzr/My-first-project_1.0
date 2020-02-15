package exercises.ch5;

public class valueOfPiTest {
    public static void main(String[] args) {
        valueOfPi a = new valueOfPi();
        System.out.printf("Pi = %.200f%n", a.result());
        System.out.printf("Original value: %.200f", Math.PI);
    }
}
