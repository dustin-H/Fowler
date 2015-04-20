public class NormalPrice implements Price {

    public int getPriceCode() {
        return Movie.NORMAL;
    }

    public double getCharge(int rentedDays) {
        if (rentedDays > 2) return (rentedDays - 2) * 1.5;
        else return 2;
    }

    public int getFrequentRenterPoints(int rentedDays) {
        return 1;
    }
}