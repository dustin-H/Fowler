public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }


    public double getCharge(int rentedDays) {
        double ret = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                ret += 2;
                if (rentedDays > 2)
                    ret += (rentedDays - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                ret += rentedDays * 3;
                break;
            case Movie.CHILDRENS:
                ret += 1.5;
                if (rentedDays > 3)
                    ret += (rentedDays - 3) * 1.5;
                break;
        }
        return ret;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            return 2;
        return 1;
    }
}