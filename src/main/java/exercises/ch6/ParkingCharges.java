package exercises.ch6;

public class ParkingCharges {
    double minimumFee = 2.00;
    double price = 0.50;
    int maxHours = 24;
    double maxCharges = 10.00;

    public double calculateCharges(double k) {
        if (k <= 3 && k > 0) {
            return (minimumFee);
        }
        if (k > 3 && k <= maxHours) {
            double res = minimumFee + (k - 3) * price;
            if (res > 10) {
                return (maxCharges);
            } else {
                return (res);
            }
        }
        return 0;
    }
}
