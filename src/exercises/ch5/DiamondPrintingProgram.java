package exercises.ch5;


public class DiamondPrintingProgram {

    private String s = " ";
    private String a = "*";
    private int param;

    public void setParam(int param) {
        if ((param >= 3) && (param <= 19) && (param % 2 == 1)) {
            this.param = param;
        } else {
            System.out.println("Note: Odd number in range from 1 to 19");
        }
    }

    protected void print() {

        for (int i = 1; i < param; i += 2) {
            for (int j = 1; j <= param; j += 1) {
                if ((j > (param - i) / 2) && (j <= (param + i) / 2)) {
                    System.out.print(a);
                } else {
                    System.out.print(s);
                }
            }
            System.out.println();
        }
        for (int i = param; i >= 1; i -= 2) {
            for (int j = 1; j <= param; j += 1) {
                if ((j > (param - i) / 2) && (j <= (param + i) / 2)) {
                    System.out.print(a);
                } else {
                    System.out.print(s);
                }
            }
            System.out.println();
        }

    }
}
