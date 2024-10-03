public class GroupTour extends Tour {
    private int numberOfPeople;

    public GroupTour(String location, int days, double chargePerPerson, int numberOfPeople) {
        super(location, days, chargePerPerson);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public double calculateTotalCharge() {
        return days * chargePerPerson * numberOfPeople;
    }

    @Override
    public void showTourDetails() {
        super.showTourDetails();
        System.out.println("Number of People: " + numberOfPeople);
    }
}