public class Movie {
    public static final int KIDS = 2;
    public static final int NORMAL = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    private Price price;

    public Movie(String newtitle, int priceCode) {
        setTitle(newtitle);
        setPriceCode(priceCode);
    }

    public setTitle(String newtitle){
        title = newtitle;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case NORMAL:
                price = new NormalPrice();
                break;
            case KIDS:
                price = new KidsPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Invalid Price Code");
        }
    }

    public String getTitle() {
        return title;
    }


    public double getCharge(int rentedDays) {
        return price.getCharge(rentedDays);
    }

    public int getFrequentRenterPoints(int rentedDays) {
        return price.getFrequentRenterPoints(rentedDays);
    }
}