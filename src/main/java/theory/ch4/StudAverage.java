package theory.ch4;

public class StudAverage {
    public static void main(String[] args) {
        Student account1 = new Student("Arnold", 34.55);
        Student account2 = new Student("Alex", 89.99);

        System.out.printf("Student's %s letter grade is %s with average %.2f%n%n", account1.getName(), account1.getLetterGrade(), account1.getAverage());
        System.out.printf("Student's %s letter grade is %s with average %.2f", account2.getName(), account2.getLetterGrade(), account2.getAverage());
    }
}
