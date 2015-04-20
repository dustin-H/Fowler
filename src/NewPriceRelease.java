public class NewReleasePrice implements Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int rentedDays) {
        return (rentedDays * 3);
    }

    public int getFrequentRenterPoints(int rentedDays) {
        return 2;
    }

}