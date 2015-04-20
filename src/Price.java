public interface Price {
    abstract int getPriceCode();

    abstract double getCharge(int rentedDays);

    abstract int getFrequentRenterPoints(int rentedDays);
}