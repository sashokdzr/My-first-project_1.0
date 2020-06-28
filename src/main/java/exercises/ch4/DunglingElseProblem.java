package exercises.ch4;

public class DunglingElseProblem {
    public void forXY1(int x, int y) {
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }
    }

    public void forXY2(int x, int y) {
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            }
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }

    public void forXY3(int x, int y) {
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }
    }

    public void forXY4(int x, int y) {
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}
