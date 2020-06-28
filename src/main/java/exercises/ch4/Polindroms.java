package exercises.ch4;

public class Polindroms {
    private int number;
    protected int d1;
    protected int d2;
    protected int d4;
    protected int d5;

    public void check(int number) {
        if ((number / 10000) >= 1) {
            System.out.println("Validation check - OK");
        } else {
            System.out.println("Input five-digit integers number!");

        }
    }

    public void num(int number) {
        int d1 = number / 10000;
        int d2 = number / 1000 - d1 * 10;
        int d4 = (number % 100 - number % 10) / 10;
        int d5 = number % 10;
        this.d1 = d1;
        this.d2 = d2;
        this.d4 = d4;
        this.d5 = d5;
        System.out.print(d1 + " " + d2 + " " + d4 + " " + d5 + " ");
        System.out.println("Division check - OK");
    }

    public void result() {
        if (d1 == d5 && d2 == d4) {
            System.out.println("Polindrom!!!");
        } else {
            System.out.println("It isn't a Polindrom");
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
