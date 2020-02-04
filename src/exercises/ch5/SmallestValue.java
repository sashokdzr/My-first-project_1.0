package exercises.ch5;

public class SmallestValue {
    private int firstValue;
    private int value;
    private int[] arr = new int[firstValue];
    private int smallest;

    public SmallestValue(int firstValue, int value) {
        this.firstValue = firstValue;
        this.value = value;
    }

    public void enter() {
        int[] arr = new int[firstValue];
        for (int i = 0; i <= firstValue; i++) {
            arr[i] = value;
        }
        this.arr = arr;
    }

    public void smallest() {
        smallest = arr[0];
        for (int i = 1; i < firstValue; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSmallest() {
        return smallest;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }
}
