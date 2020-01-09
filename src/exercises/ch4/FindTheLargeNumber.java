package exercises.ch4;

public class FindTheLargeNumber {
    private int largestNumber;
    private int number;

    public FindTheLargeNumber(int largestNumber, int number) {
        this.largestNumber = largestNumber;
        this.number = number;
    }

    public int largeNumber() {
        if (number >= largestNumber)
            largestNumber = number;
        return largestNumber;
    }

    public int getLargestNumber() {
        return largestNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setLargestNumber(int largestNumber) {
        this.largestNumber = largestNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
