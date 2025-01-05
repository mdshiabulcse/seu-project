public abstract class Tour {
    protected String location;
    protected int days;
    protected double pricePerDayPerPerson;

    public Tour(String location, int days, double pricePerDayPerPerson) {
        this.location = location;
        this.days = days;
        this.pricePerDayPerPerson = pricePerDayPerPerson;
    }

    public String getLocation() {
        return location;
    }

    public int getDays() {
        return days;
    }

    public double calculateTotalCharge() {
        return days * pricePerDayPerPerson;
    }

    public abstract void showTourDetails();
}
