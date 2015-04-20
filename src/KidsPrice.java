
public class KidsPrice implements Price {


    public int getPriceCode() {
        return Movie.KIDS;
    }

    public double getCharge(int rentedDays) {
        if (rentedDays > 3) return (rentedDays - 3) * 1.5;
        else return 1.5;
    }

    public int getFrequentRenterPoints(int rentedDays) {
        return 1;
    }

}