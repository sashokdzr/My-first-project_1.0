package exercises.ch5;

public class DeMorgansLaws {
    private int x, y, a, b, g, i, j;

    public void DeMorgansLaws(int x, int y, int a, int b, int g, int i, int j) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.g = g;
        this.i = i;
        this.j = j;
    }

    protected void original() {
        System.out.println(!(x < 5) && !(y >= 7));
        System.out.println(!(a == b) || !(g != 5));
        System.out.println(!((x <= 8) && (y > 4)));
        System.out.println(!((i > 4) || (j <= 6)));
    }

    protected void alternative() {
        System.out.println(!((x < 5) || (y >= 7)));
        System.out.println(!((a == b) && (g != 5)));
        System.out.println(!(x <= 8) || !(y > 4));
        System.out.println(!(i > 4) && !(j <= 6));
    }

}
