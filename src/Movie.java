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


    public double getCharge(int days) {
        double ret = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                ret += 2;
                if (days > 2)
                    ret += (days - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                ret += days * 3;
                break;
            case Movie.CHILDRENS:
                ret += 1.5;
                if (days > 3)
                    ret += (days - 3) * 1.5;
                break;
        }
        return ret;
    }
}