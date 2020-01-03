package exercises.ch3;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else {
            System.out.println("Incorrect month value");
        }
        if (day >= 1 && day <= 31)
            this.day = day;
        else System.out.println("Incorrect day value");
        if (year >= 0)
            this.year = year;
        else System.out.println("Incorrect year value");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println("Today is " + month + "/" + day + "/" + year);
    }
}

