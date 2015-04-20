class Rental {
    private Movie movie;
    private int rentedDays;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        rentedDays = newdaysRented;
    }

    public int getDaysRented() {
        return rentedDays;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return getMovie().getCharge(getDaysRented());
    }

    public int getFrequentRenterPoints() {
        return getMovie().getFrequentRenterPoints(getDaysRented());
    }
}