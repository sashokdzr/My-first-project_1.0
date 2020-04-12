package exercises.ch6;

public class RoundingNumbers1 {
    static double roundToInteger(double number) {
        return (Math.floor(number + 0.5));
    }

    static double roundToTenths(double number) {
        return (Math.floor(number * 10 + 0.5) / 10);
    }

    static double roundToHundredths(double number) {
        return (Math.floor(number * 100 + 0.5) / 100);
    }

    static double roundToThousands(double number) {
        return (Math.floor(number * 1000 + 0.5) / 1000);
    }
}
