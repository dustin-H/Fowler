class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        double ret = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                ret += 2;
                if (getDaysRented() > 2)
                    ret += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                ret += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                ret += 1.5;
                if (getDaysRented() > 3)
                    ret += (getDaysRented() - 3) * 1.5;
                break;
        }
        return ret;
    }
}