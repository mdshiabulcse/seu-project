public class SingleTour extends Tour {
    public SingleTour(String location, int days, double pricePerDayPerPerson) {
        super(location, days, pricePerDayPerPerson);
    }

    @Override
    public void showTourDetails() {
        System.out.println("Single Tour Details:");
        System.out.println("Location: " + location);
        System.out.println("Duration: " + days + " days");
        System.out.println("Price per day per person: $" + pricePerDayPerPerson);
        System.out.println("Total Charge: $" + calculateTotalCharge());
    }
}
