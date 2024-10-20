public class TourLocation {
    private String locationName;
    private double pricePerDayPerPerson;

    public TourLocation(String locationName, double pricePerDayPerPerson) {
        this.locationName = locationName;
        this.pricePerDayPerPerson = pricePerDayPerPerson;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getPricePerDayPerPerson() {
        return pricePerDayPerPerson;
    }

    @Override
    public String toString() {
        return locationName + " ($" + pricePerDayPerPerson + " per day per person)";
    }
}
