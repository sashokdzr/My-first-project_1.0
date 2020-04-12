package exercises.ch5;

public class DeMorgansLawsTest {
    public static void main(String[] args) {
        DeMorgansLaws test = new DeMorgansLaws();
        test.DeMorgansLaws(6, 8, 8, 9, 1, 5, 3);
        test.original();
        System.out.println();
        test.alternative();
    }
}
